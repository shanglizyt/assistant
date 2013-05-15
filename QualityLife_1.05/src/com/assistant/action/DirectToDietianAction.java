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
public class DirectToDietianAction extends ActionSupport {
	private IUserService userService;
	private IDietianService dietianService;
	private IDietianAdviceService dietianAdviceService;
//	private ITabooService tabooService;
	private IRecordService recordService;
	private String userName;
	private String password;
	private String option;
	
	private PageBean pageBean_taboo;
	private PageBean dietian_list;
	private User u;
	private Dietian dietian;
	
	private int page;
	
	@Override
	public String execute() throws Exception {
		System.out.println("login:userName:"+userName+" password:"+password);
		if(!dietianService.validateDietian(userName, password)){
			addFieldError(userName, "用户名或密码错误！");
			return INPUT;
		}
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("userName",userName);
		dietian = dietianService.getDietianByName(userName);
		dietian_list = dietianService.queryForPage(5, page);
		return "tomain";
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

//	public ITabooService getiTabooService() {
//		return iTabooService;
//	}
//
//	@Resource
//	public void setiTabooService(ITabooService iTabooService) {
//		this.iTabooService = iTabooService;
//	}

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

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
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
}
