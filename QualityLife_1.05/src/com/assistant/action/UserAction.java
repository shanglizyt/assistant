/*
 * 注册用户的操作
 * 包括增删改查
 */

package com.assistant.action;

import java.awt.Font;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.stereotype.Component;

import com.assistant.model.AdviceMenu;
import com.assistant.model.Consult;
import com.assistant.model.Dietian;
import com.assistant.model.DietianAdvice;
import com.assistant.model.Dish;
import com.assistant.model.User;
import com.assistant.service.IAdviceMenuService;
import com.assistant.service.IArticleService;
import com.assistant.service.IDietianAdviceService;
import com.assistant.service.IDietianService;
import com.assistant.service.IDishService;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;
import com.assistant.util.System_Property;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({"serial","rawtypes"})
@Component
public class UserAction extends ActionSupport implements ApplicationAware {
	
	private Map application;

	private int id;
	private IUserService userService;
	private IDietianService dietianService;
	private IDietianAdviceService dietianAdviceService;
//	private ITabooService tabooService;
	private IArticleService articleService;
	private IAdviceMenuService adviceMenuService;
	private IDishService dishService;
	private List<User> users;
	private List<AdviceMenu> advs;//
	private List<Dish> dishs;// 按口味查询出来的菜品
	private List<DietianAdvice> dietianAdvices;
	private User user;
	private Dietian dietian;

	private PageBean pageBean_taboo;
	private PageBean dietian_list;

	private String wenti;
	private String userName;
	private String password;
	private String newpassword;
	private int page;
	
	private File myFile;// 得到头像文件
	private String myFileContentType;// 得到文件的类型
	private String myFileFileName;// 得到文件的名称
	
	private JFreeChart chart;
	
	private String message;
	private List<String> u_messages = new ArrayList<String>();
	private List<String> messages = new ArrayList<String>();

	/* method----------------------------------------------------------------- */
	public String main(){
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
		return SUCCESS;
	}
	

	public String modifypwd() {
		User u = userService.getUserByName(userName);
		if (u.getPassword().equals(password)) {
			u.setPassword(newpassword);
			userService.saveUser(u);
			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("userName", userName);
			u = userService.getUserByName(userName);
			pageBean_taboo = articleService.queryForPage(6, page,3);
			return "modifypwd_success";
		} else
			return "modifypwd-input";
	}
	
	/**
	 * 去完善个人信息
	 * */
	public String tocompleteinfo(){
		user = userService.getUserById(id);
		System.out.println("Id:"+user.getId());
		return "tocompleteinfo";
	}
	
	/**
	 * 完善个人信息
	 * */
	public String completeinfo() throws Exception{
		System.out.println("into completeinfo。。。");
		System.out.println("id:"+user.getId());
		if (myFile!=null) {
			String RealPath = ServletActionContext.getServletContext()
					.getRealPath("/images");
			File file = new File(RealPath);
			if (!file.exists()) {
				file.mkdirs();
			}
			FileUtils.copyFile(myFile, new File(file, myFileFileName));
			String path = RealPath + "/" + myFileFileName;
			ServletActionContext.getRequest().setAttribute("realpath", path);
			String ralativePath = "images/" + myFileFileName;
			this.user.setImageurl(ralativePath);
		}
		user.setInfo_complete(1);
		userService.updateUser(user);
		user = userService.getUserById(user.getId());
		id = user.getId();
		return "completeinfo";
	}

	/**
	 * 已注册用户跳转向个人口味页面
	 * */
	public String kouwei() {
		User u = userService.getUserById(id);
		int kouwei = u.getKouwei();
		dishs = dishService.getDishByKouWei(5, kouwei);
		System.out.println("kouwei->age:" + u.getAge());
		return "kouwei";
	}

	/**
	 * 已注册用户跳转向定制页面（不同于普通游客，根据身体指标推荐）
	 * */
	public String dingzhi() {
		user = userService.getUserById(id);/*年龄，身高，工作，性别，体重，高压，低压，血糖，血脂，口味，病史，过敏*/
		try{
			dishs = dishService.getAllDishs();
		}catch(Exception e){
			dishs = null;
			return "null";
		}
		switch(System_Property.overWeight(user.getHeight(), user.getWeight(), user.getSex())){
		case -2:{
			
		};break;//过瘦
		case -1:{
			
		};break;//瘦
		case 0:{
			
		};break;//适中
		case 1:{
			
		};break;//胖
		case 2:{
			
		};break;//过胖
		}
		
		return null;
	}

	/**
	 * 已注册用户跳转向营养分析页面
	 * */
	public String fenxi() {
		return null;
	}

	/**
	 * 已注册用户跳转向营养师页面
	 * */
	@SuppressWarnings({ "unchecked" })
	public String dietian() {
		user = userService.getUserById(id);
		try {
			dietianAdvices = new ArrayList(user.getDietianAdvices());
			for (;dietianAdvices.size()>5;) {
				dietianAdvices.remove(dietianAdvices.size() - 1);
			}
		} catch (Exception e) {
			dietianAdvices = null;
		}
		return "dietian";
	}
	
	/**
	 * 用户提问
	 * */
	public String question(){
		System.out.println("into question...");
		try{
			List<Dietian> dietians = dietianService.getAllDietians();
			int i = dietians.size();
			Random r = new Random();
			int rand = r.nextInt(i-1);
			Consult c = new Consult();
			c.setReplyer(dietians.get(rand));
			c.setUser(userService.getUserById(id));
			c.setQuestion(wenti);
			c.setIsReplied(0);
			c.setDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
			return "dietian";
		}catch(Exception e){
			this.addFieldError("error", "暂无营养师！");
			return "error";
		}
	}

	public String list() {
		this.users = this.userService.getAllUsers();
		return "list";
	}

	public String adduser() {
		userService.saveUser(user);
		return "addsuccess";
	}

	public String delete() {
		userService.deleteUserById(id);
		return "list";
	}

	public String update() throws Exception {
		userService.saveUser(user);
		return "update";
	}

	public String updateInput() {
		this.user = userService.getUserById(id);
		return "input";
	}

	/**
	 * 图表生成
	 * @return draw
	 * */
	@SuppressWarnings("unused")
	public String draw() {

		System.out.println("into draw...");
		int width;// 图象宽度
		int height; // 图象高度
		String chartTitle;// 图表标题
		String subtitle;// 副标题
		String xTitle;// X轴标题
		String yTitle;// Y轴标题
		String[] cutline;// 图例名称
		String category[]; // 统计种类
		Double[][] data;// 绘图数据

		width = 450;
		height = 325;
		chartTitle = "用户个人营养摄入分析";
		subtitle = "------统计时间：2013年";
		xTitle = "销售季度";
		yTitle = "摄入量    单位:g";
		cutline = new String[] { "糖类", "维生素", "脂肪", "蛋白质" };
		category = new String[] { "1月", "2月", "3月", "4月", "5月", "6月" };

		// 创建主题样式，解决中文乱码
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
		// 设置标题字体
		standardChartTheme.setExtraLargeFont(new Font("黑体", Font.BOLD, 20));
		// 设置图例的字体
		standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
		// 设置轴向的字体
		standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
		// 应用主题样式
		ChartFactory.setChartTheme(standardChartTheme);

		data = new Double[cutline.length][category.length];
		for (int m = 0; m < cutline.length; m++) {
			for (int n = 0; n < category.length; n++) {
				data[m][n] = 1 + Math.random() * 100;
			}
		}
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (int m = 0; m < cutline.length; m++) {
			for (int n = 0; n < category.length; n++) {
				dataset.addValue(data[m][n], cutline[m], category[n]);
			}
		}
		setChart(ChartFactory.createBarChart3D(chartTitle, // 图表标题
				xTitle, // X轴标题
				yTitle, // Y轴标题
				dataset, // 绘图数据集
				PlotOrientation.VERTICAL, // 柱形图绘制方向
				true, // 显示图例
				true, // 采用标准生成器
				false // 生成链接
				));

//		// 自定义图表开始：
//		if (subtitle.length() > 0) {// 添加副标题
//			chart.addSubtitle(new TextTitle(subtitle));
//		}
//
//		GradientPaint chartGP = new GradientPaint(0, 0,
//				new Color(219, 227, 251), 0, height, Color.WHITE, false);// 创建渐变色对象
//		chart.setBackgroundPaint(chartGP);// 设置图片背景色
//
//		// 通过绘图区对象，可以设置更多的绘图属性
//		CategoryPlot plot = chart.getCategoryPlot();
//
//		plot.setBackgroundPaint(Color.PINK);// 设置绘图区背景色
//
//		plot.setRangeGridlinePaint(Color.RED);// 设置水平方向背景线颜色
//		plot.setRangeGridlinesVisible(true);// 设置是否显示水平方向背景线,默认值为true
//
//		plot.setDomainGridlinePaint(Color.RED);// 设置垂直方向背景线颜色
//		plot.setDomainGridlinesVisible(true);// 设置是否显示垂直方向背景线,默认值为false
//
//		// 通过柱形对象，可以设置柱形的绘图属性
//		BarRenderer renderer = (BarRenderer) plot.getRenderer();
//
//		renderer.setDrawBarOutline(false);// 设置是否绘制柱形的轮廓线，默认值为true
//
//		// 设置填充柱形的渐进色
//		Color color[] = new Color[cutline.length];
//		color[0] = new Color(99, 99, 0);
//		color[1] = new Color(255, 169, 66);
//		color[2] = new Color(33, 255, 66);
//		for (int i = 0; i < color.length; i++) {
//			GradientPaint gp = new GradientPaint(0, 0, color[i].brighter(), 0,
//					height, color[i].darker());
//			renderer.setSeriesPaint(i, gp);
//		}
//
//		// 设置横轴标题文字的旋转方向
//		CategoryAxis domainAxis = plot.getDomainAxis();
//		domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
//		// 自定义图表结束！
//
//		// 固定用法
//		ChartRenderingInfo info = new ChartRenderingInfo(
//				new StandardEntityCollection());

		return "draw";
	}
	
	/**------------------------------------------------------------------------------------*/
	/*
	@SuppressWarnings("unchecked")
	public String send(){
		messages = (List<String>) application.get("messages");
		//Iterator<User> it = users.iterator();
		user = userService.getUserById(id);
		if(message!=null){
//			message = user.getName()+":"+message;
			message = "user"+":"+message;
			messages.add(message);
			application.put("messages", messages);
			return "message";
		}
		else{
			this.addFieldError("input_error", "发送内容不能为空！");
			return "input_message";
		}
	}
	*/
	/**------------------------------------------------------------------------------------*/
	
	/*
	 * getters and
	 * setters-----------------------------------------------------------------
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public IDietianService getDietianService() {
		return dietianService;
	}

	@Resource
	public void setDietianService(IDietianService dietianService) {
		this.dietianService = dietianService;
	}

//	public ITabooService getTabooService() {
//		return tabooService;
//	}
//
//	@Resource
//	public void setTabooService(ITabooService tabooService) {
//		this.tabooService = tabooService;
//	}

	public PageBean getPageBean_taboo() {
		return pageBean_taboo;
	}

	public void setPageBean_taboo(PageBean pageBean_taboo) {
		this.pageBean_taboo = pageBean_taboo;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public IAdviceMenuService getAdviceMenuService() {
		return adviceMenuService;
	}

	@Resource
	public void setAdviceMenuService(IAdviceMenuService adviceMenuService) {
		this.adviceMenuService = adviceMenuService;
	}

	public List<AdviceMenu> getAdvs() {
		return advs;
	}

	public void setAdvs(List<AdviceMenu> advs) {
		this.advs = advs;
	}

	public List<Dish> getDishs() {
		return dishs;
	}

	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}

	public IDishService getDishService() {
		return dishService;
	}

	@Resource
	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}

	public IDietianAdviceService getDietianAdviceService() {
		return dietianAdviceService;
	}

	@Resource
	public void setDietianAdviceService(
			IDietianAdviceService dietianAdviceService) {
		this.dietianAdviceService = dietianAdviceService;
	}

	public List<DietianAdvice> getDietianAdvices() {
		return dietianAdvices;
	}

	public void setDietianAdvices(List<DietianAdvice> dietianAdvices) {
		this.dietianAdvices = dietianAdvices;
	}

	public String getWenti() {
		return wenti;
	}

	public void setWenti(String wenti) {
		this.wenti = wenti;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public IArticleService getArticleService() {
		return articleService;
	}

	@Resource
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getU_messages() {
		return u_messages;
	}

	public void setU_messages(List<String> u_messages) {
		this.u_messages = u_messages;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public Map getApplication() {
		return application;
	}

	public void setApplication(Map application) {
		this.application = application;
	}

}
