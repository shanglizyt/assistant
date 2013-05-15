package com.assistant.action;

import java.util.Map;

import javax.annotation.Resource;

import com.assistant.model.User;
import com.assistant.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MainAction extends ActionSupport {
	private IUserService userManager;
	private String userName;
	private User user;
	
	@Override
	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		userName = (String) session.get("userName");
		if(userName != null)
		user = userManager.getUserByName(userName);
		return SUCCESS;
	}
	
	public IUserService getUserManager() {
		return userManager;
	}
	
	@Resource
	public void setUserManager(IUserService userManager) {
		this.userManager = userManager;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
