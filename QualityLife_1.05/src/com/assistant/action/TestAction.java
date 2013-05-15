package com.assistant.action;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.assistant.model.User;
import com.assistant.service.IUserService;

@Component
public class TestAction {
	private IUserService userService;

	/**
	 * @param args
	 */
	@Test
	public void main() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml"); 
		IUserService us = (IUserService) ctx.getBean("userService"); 
		User u = new User();
		u.setName("I");
		us.saveUser(u);
	}

	public IUserService getUserService() {
		return userService;
	}
	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
