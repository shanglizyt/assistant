package com.assistant.dao.impl;

import javax.annotation.Resource;

import org.junit.Test;

import com.assistant.model.User;
import com.assistant.service.IUserService;

public class TestAbstractBaseDao {
	private AbstractBaseDao ab;
	private IUserService userService;

	@Test
	public void Test(){
		User u = new User();
		u.setName("a");
		//userService.saveUser(u);
		ab.saveOrUpdate(u);
	}

	public AbstractBaseDao getAb() {
		return ab;
	}

	@Resource
	public void setAb(AbstractBaseDao ab) {
		this.ab = ab;
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
