package com.assistant.action;

import java.util.Map;
import javax.annotation.Resource;
import com.assistant.model.Dietian;
import com.assistant.model.User;
import com.assistant.service.IDietianAdviceService;
import com.assistant.service.IDietianService;
import com.assistant.service.IRecordService;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private IUserService userService;
	private IDietianService dietianService;
	private IDietianAdviceService dietianAdviceService;
	private IRecordService recordService;
	private String userName;
	private String password;
	private String option;
	
	private PageBean pageBean_taboo;
	private PageBean dietian_list;
	private User user;
	private int id;
	private Dietian dietian;
	
	private int page;
	
//	HttpServletRequest request;
	
	@Override
	public String execute() throws Exception {
		if(option==null){
			System.out.println("user login...");
			if(!userService.validateUser(userName, password))
			{
				addFieldError(userName, "用户名或密码错误！");
				return INPUT;
			}
			user = userService.getUserByName(userName);
			id = user.getId();
			//System.out.println("age:"+u.getAge());
//			Map<String, Object> session = ActionContext.getContext().getSession();
//			session.put("userName",userName);
//			u = userService.getUserByName(userName);
			// pageBean_taboo = iTabooService.queryForPage(6, page);
			/* 本来应该将营养师的建议放在里面，但是user中设置dietianadvice的字段的cascade为eager，所以会
			 自动取出来，在页面显示的时候直接拿出来就行了*/
//			Set<Record> r1 = (Set<Record>)u.getRecords();
//			Record[] r = (Record[]) r1.toArray();
//			for(int i=0;r[i]!=null;i++){
//				record_5.add(recordService.getRecordById(r[i].getDish_id()));
//			}
//			UserAction ua = new UserAction();
//			ua.tomain();
			return "user";
		}
		else if(option.equals("dietian")){
			System.out.println("dietian login...");
			if(!dietianService.validateDietian(userName, password)){
				addFieldError(userName, "用户名或密码错误！");
				return INPUT;
			}
//			Map<String, Object> session = ActionContext.getContext().getSession();
//			session.put("userName",userName);
			dietian = dietianService.getDietianByName(userName);
			id = dietian.getId();
//			dietian_list = dietianService.queryForPage(5, page);
			return "dietian";
		}
		else {
			System.out.println("illegal login...");
			return INPUT;
		}
	}

//	@Override
//	public void validate() {
//		if(userName == null || userName.length()<1){
//			addFieldError("loginName", "用户名不能为空！");
//		}
//		if(password == null || password.length()<1){
//			addFieldError(password, "密码格式错误");
//		}
//	}

	public String logout(){
		System.out.println("into logout。。。");
		user = null;
		Map<String, Object> session = ActionContext.getContext().getSession();
		//System.out.println("userName:"+session.get("userName"));
		session.remove("user");
//		HttpSession session = request.getSession();
//		session.removeAttribute("userName");
		return "logout_success";
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
	public void setDietianAdviceService(IDietianAdviceService dietianAdviceService) {
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

	public IRecordService getRecordService() {
		return recordService;
	}

	@Resource
	public void setRecordService(IRecordService recordService) {
		this.recordService = recordService;
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
