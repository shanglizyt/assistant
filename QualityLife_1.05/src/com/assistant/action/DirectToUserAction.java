package com.assistant.action;

import java.util.Map;

import javax.annotation.Resource;
import com.assistant.model.Comment;
import com.assistant.model.Dietian;
import com.assistant.model.User;
import com.assistant.service.IArticleService;
import com.assistant.service.ICommentService;
import com.assistant.service.IDietianAdviceService;
import com.assistant.service.IDietianService;
import com.assistant.service.IDishService;
import com.assistant.service.IRecordService;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DirectToUserAction extends ActionSupport {
	private IUserService userService;
	private IDietianService dietianService;
	private IDietianAdviceService dietianAdviceService;
	private IArticleService articleService;
//	private ITabooService tabooService;
	private IRecordService recordService;
	private ICommentService commentService;
	private IDishService dishService;
//	private String userName;
//	private String password;
	private String option;
	private int id;

	// private List<Dish> kouweitc;

	private PageBean pageBean_taboo;
	private PageBean dietian_list;
	private User user = new User();
	private Dietian dietian;
	private Comment c;
	private int page;
	
//	HttpServletRequest request;

	@Override
	public String execute() throws Exception{
		user = userService.getUserById(id);
		/*userName = user.getName();
		password = user.getPassword();*/
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("user", user);
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userName);
//		user = userService.getUserByName(userName);
		// pageBean_taboo = tabooService.queryForPage(6, page);
		pageBean_taboo = articleService.queryForPage(10, page, 3);
		// kouweitc = dishService.getDishByKouWei(5, user.getKouwei());
		// 体制报告
		return "tomain";

	}

	/*public String getUserName() {
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
	}*/

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public IDietianAdviceService getDietianAdviceService() {
		return dietianAdviceService;
	}

	@Resource
	public void setDietianAdviceService(
			IDietianAdviceService dietianAdviceService) {
		this.dietianAdviceService = dietianAdviceService;
	}

	public PageBean getPageBean_taboo() {
		return pageBean_taboo;
	}

	public void setPageBean_taboo(PageBean pageBean_taboo) {
		this.pageBean_taboo = pageBean_taboo;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public IDietianService getDietianService() {
		return dietianService;
	}

	@Resource
	public void setDietianService(IDietianService dietianService) {
		this.dietianService = dietianService;
	}

	public PageBean getDietian_list() {
		return dietian_list;
	}

	public void setDietian_list(PageBean dietian_list) {
		this.dietian_list = dietian_list;
	}

	public Dietian getDietian() {
		return dietian;
	}

	public void setDietian(Dietian dietian) {
		this.dietian = dietian;
	}

	public IRecordService getRecordService() {
		return recordService;
	}

	@Resource
	public void setRecordService(IRecordService recordService) {
		this.recordService = recordService;
	}

	public ICommentService getCommentService() {
		return commentService;
	}

	@Resource
	public void setCommentService(ICommentService commentService) {
		this.commentService = commentService;
	}

	public Comment getC() {
		return c;
	}

	public void setC(Comment c) {
		this.c = c;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public ITabooService getTabooService() {
//		return tabooService;
//	}
//
//	@Resource
//	public void setTabooService(ITabooService tabooService) {
//		this.tabooService = tabooService;
//	}

	public IArticleService getArticleService() {
		return articleService;
	}

	@Resource
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}

	// public Set<Dish> getKouweitc() {
	// return kouweitc;
	// }
	//
	// public void setKouweitc(Set<Dish> kouweitc) {
	// this.kouweitc = kouweitc;
	// }

	public IDishService getDishService() {
		return dishService;
	}

	@Resource
	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	@Override
//	public void setServletRequest(HttpServletRequest request) {
//		// TODO Auto-generated method stub
//		this.request = request;
//	}

}
