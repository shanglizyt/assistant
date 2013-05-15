package com.assistant.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistant.dao.IUserDao;
import com.assistant.model.User;

public class TestUserDao {
	
	private IUserDao userDao;
	
	@Test
	public void testSave() {

		// 这个要根据需要进行修改，在classes路径中去寻找配置文件。

		ApplicationContext ctx = 
		   new ClassPathXmlApplicationContext("beans.xml");

		userDao = (IUserDao) ctx.getBean("userDao");
		
		User user = new User();
		user.setId(0);
		user.setAge(0);
		user.setName("jack");
		user.setPassword("123456");
		userDao.saveOrUpdate(user);
		

	}


}
