package com.assistant.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.assistant.model.AdviceMenu;
import com.assistant.model.Article;
import com.assistant.model.Comment;
import com.assistant.model.Dietian;
import com.assistant.model.Dish;
import com.assistant.model.Food;
import com.assistant.model.LiuYan;
import com.assistant.model.User;
import com.assistant.service.IAdviceMenuService;
import com.assistant.service.IArticleService;
import com.assistant.service.ICommenService;
import com.assistant.service.ICommentService;
import com.assistant.service.IConsultService;
import com.assistant.service.IDietianAdviceService;
import com.assistant.service.IDietianService;
import com.assistant.service.IDishService;
import com.assistant.service.IFoodService;
import com.assistant.service.IRecordService;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({"serial","rawtypes"})
public class CommenAction extends ActionSupport {
	
	//private Map application;
	//private Map session;
	
	private IAdviceMenuService adviceMune;
	private IArticleService articleService;
	private ICommenService commenService;
	private ICommentService commentService;
	private IConsultService consultService;
	private IDietianAdviceService dietianAdvice;
	private IDietianService dietianService;
	private IDishService dishService;
	private IFoodService foodService;
	private IRecordService recordService;
	private IUserService userService;
	
	private AdviceMenu adviceMenu;
	private Dietian dietian;
	private User user;
	private Dish dish;
	private Food food;
	private LiuYan liuyan;
	
	private List<Article> taboos;
	private List<Dish> dishs;
	private List<Dish> dish_to_display;
	private List<Dish> dish_top5;
	private List<Comment> comments;
	private List<Dietian> dietians;
	private List<Article> liuyans;

	private String userName;
	private String password;
	private String option;
	
	private int page;
	private String keyword;//搜索关键字
	private String liuyan_content;//首页留言内容
	private int dish_id;
	private int food_id;
	private int taboo_id;
	private int id;
	
	private Article taboo;
	private Article article;
	private Article zhiliao;
	
	PageBean pageBean;
	
	private String type;
		
	/*method-----------------------------------------------------------------*/
	
	/**
	 * 跳转至主页的方法
	 * */
	public String index(){
		return SUCCESS;
	}
	/**
	 * 跳转至主页所需的方法
	 * 
	 * */
	@SuppressWarnings("unchecked")
	public String main(){
		System.out.println("into main...");
		if(id!=0){
			user = userService.getUserById(id);
		}
		/** 若干条饮食禁忌*/
		taboos = articleService.queryForPage(10, page,3).getList();
		/** 将在首页展示的菜品图片集*/
		dish_to_display = dishService.getDishsByHql("from dish d where d.isdisplay = true");
		/** 首页美食榜*/
		dish_top5 = dishService.getTop5();
		/** 首页显示评论*/
		liuyans = commenService.queryForPage(new LiuYan(), 5, page).getList();
//		return "main";
		return SUCCESS;
	}
	public String tologin(){
		return SUCCESS;
	}
	public String login() throws Exception {
		if(option==null){
			System.out.println("user login...");
			if(!userService.validateUser(userName, password))
			{
				addFieldError(userName, "用户名或密码错误！");
				return SUCCESS;//返回success是为了跳转到login页面去
			}
			user = userService.getUserByName(userName);
			id = user.getId();
//			Map<String, Object> session = ActionContext.getContext().getSession();
//			session.put("userName",userName);
			return "touser";//利用chain方式跳转至User主页
		}
		else if(option.equals("dietian")){
			System.out.println("dietian login...");
			if(!dietianService.validateDietian(userName, password)){
				addFieldError(userName, "用户名或密码错误！");
				return SUCCESS;//返回success是为了跳转到login页面去
			}
//			Map<String, Object> session = ActionContext.getContext().getSession();
//			session.put("userName",userName);
			dietian = dietianService.getDietianByName(userName);
			id = dietian.getId();
			return "dietian";
		}
		else {
			System.out.println("illegal login...");
			return INPUT;
		}
	}
	public String logout(){
		System.out.println("into logout。。。");
		user = null;
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("user");
		return "logout_success";
	}
	/**
	 * 搜索
	 * */
	@SuppressWarnings({ "unchecked" })
	public String sousuo(){
		dish_top5 = dishService.getTop5();
		List list = articleService.getArticlesByHql("from article a where a.title like '%"+keyword+"%' or a.content like '%"+keyword+"%'");
		if(!list.isEmpty()){
			System.out.println("搜索结果不为空");
			pageBean.setList(list);
			for(Article a:(List<Article>)pageBean.getList()){
				if(a.getContent().length()>100){
					String s = String.copyValueOf(a.getContent().toCharArray(), 0, 100);
					a.setContent(s);
				}
			}
		}
		else{
			pageBean=null;
		}
		return SUCCESS;
	}
	
	/**
	 * 普通用户看到的营养师问答
	 * */
	public String dietian(){
		pageBean = consultService.queryForPage(10, page);
		dietians = dietianService.getDietiansByHql("from dietian limit 12");
		return SUCCESS;
	}
	/** 
	 * 查看菜品信息
	 * */
	public String dishdetail(){
		dish = dishService.getDishById(dish_id);
		return SUCCESS;
	}
	/** 
	 * 查看食材信息
	 * */
	public String fooddetail(){
		food = foodService.getFoodById(food_id);
		return SUCCESS;
	}
	
	/**
	 * 文章的详细信息
	 * */
	public String article(){
		article = articleService.getArticleById(id);
		return SUCCESS;
	}
	
	/**
	 * 得到文章中的常识相关文章列表
	 * */
	public String changshilist(){
		dish_top5 = dishService.getTop5();
		pageBean = articleService.queryForPage(10, page,1);
		return SUCCESS;
	}
	
	/**
	 * 得到文章中的治疗相关文章列表
	 * */
	public String zhiliaolist(){
		dish_top5 = dishService.getTop5();
		pageBean = articleService.queryForPage(10, page,2);
		return SUCCESS;
	}
	
	/**
	 * 得到文章中的饮食禁忌相关文章列表
	 * */
	public String taboolist(){
		dish_top5 = dishService.getTop5();
		pageBean = articleService.queryForPage(10, page, 3);
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String tuijianlist(){
		dish_top5 = dishService.getTop5();
		dishs = (List<Dish>) commenService.getTuiJian();
		return SUCCESS;
	}
	
	public String liuyan(){
		System.out.println("into liuyan...");
		if(liuyan_content.length()<5){
			this.addFieldError("liuyan", "留言内容过少");
			return "tomain";
		}
		liuyan = new LiuYan();
		liuyan.setDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
		liuyan.setContent(liuyan_content);
		try{
			if(id!=0){
				user = userService.getUserById(id);
				liuyan.setUserName(user.getName());
			}
		}catch(Exception e){
			liuyan.setUserName("游客");
		}
		commenService.saveObject(liuyan);
		return "tomain";
	}
	

/*getters and setters-----------------------------------------------------------------*/
	
	public IAdviceMenuService getAdviceMune() {
		return adviceMune;
	}

	@Resource
	public void setAdviceMune(IAdviceMenuService adviceMune) {
		this.adviceMune = adviceMune;
	}

	public IArticleService getArticleService() {
		return articleService;
	}

	@Resource
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}

	public ICommentService getCommentService() {
		return commentService;
	}

	@Resource
	public void setCommentService(ICommentService commentService) {
		this.commentService = commentService;
	}

	public IConsultService getConsultService() {
		return consultService;
	}

	@Resource
	public void setConsultService(IConsultService consultService) {
		this.consultService = consultService;
	}

	public IDietianAdviceService getDietianAdvice() {
		return dietianAdvice;
	}

	@Resource
	public void setDietianAdvice(IDietianAdviceService dietianAdvice) {
		this.dietianAdvice = dietianAdvice;
	}

	public IDietianService getDietianService() {
		return dietianService;
	}

	@Resource
	public void setDietianService(IDietianService dietianService) {
		this.dietianService = dietianService;
	}

	public IDishService getDishService() {
		return dishService;
	}

	@Resource
	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}

	public IFoodService getFoodService() {
		return foodService;
	}

	@Resource
	public void setFoodService(IFoodService foodService) {
		this.foodService = foodService;
	}
	
	public IRecordService getRecordService() {
		return recordService;
	}
	
	@Resource
	public void setRecordService(IRecordService recordService) {
		this.recordService = recordService;
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public ICommenService getCommenService() {
		return commenService;
	}
	@Resource
	public void setCommenService(ICommenService commenService) {
		this.commenService = commenService;
	}
	public List<Dish> getDishs() {
		return dishs;
	}
	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}
	public List<Article> getTaboos() {
		return taboos;
	}
	public void setTaboos(List<Article> taboos) {
		this.taboos = taboos;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<Dish> getDish_to_display() {
		return dish_to_display;
	}
	public void setDish_to_display(List<Dish> dish_to_display) {
		this.dish_to_display = dish_to_display;
	}
	public List<Dish> getDish_top5() {
		return dish_top5;
	}
	public void setDish_top5(List<Dish> dish_top5) {
		this.dish_top5 = dish_top5;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getDish_id() {
		return dish_id;
	}
	public void setDish_id(int dish_id) {
		this.dish_id = dish_id;
	}
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Article getTaboo() {
		return taboo;
	}
	public void setTaboo(Article taboo) {
		this.taboo = taboo;
	}
	public int getTaboo_id() {
		return taboo_id;
	}
	public void setTaboo_id(int taboo_id) {
		this.taboo_id = taboo_id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public AdviceMenu getAdviceMenu() {
		return adviceMenu;
	}
	public void setAdviceMenu(AdviceMenu adviceMenu) {
		this.adviceMenu = adviceMenu;
	}
	public Article getZhiliao() {
		return zhiliao;
	}
	public void setZhiliao(Article zhiliao) {
		this.zhiliao = zhiliao;
	}
	public LiuYan getLiuyan() {
		return liuyan;
	}
	public void setLiuyan(LiuYan liuyan) {
		this.liuyan = liuyan;
	}
	public String getLiuyan_content() {
		return liuyan_content;
	}
	public void setLiuyan_content(String liuyan_content) {
		this.liuyan_content = liuyan_content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Dietian getDietian() {
		return dietian;
	}
	public void setDietian(Dietian dietian) {
		this.dietian = dietian;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public List<Dietian> getDietians() {
		return dietians;
	}
	public void setDietians(List<Dietian> dietians) {
		this.dietians = dietians;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	public List<Article> getLiuyans() {
		return liuyans;
	}
	public void setLiuyans(List<Article> liuyans) {
		this.liuyans = liuyans;
	}
}
