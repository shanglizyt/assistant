package com.assistant.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistant.model.Dish;

public class DishDaoTest {

	private DishDao dishDao;
	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dishDao = (DishDao) ctx.getBean("dishDao");
		List<Dish> d = (List<Dish>) dishDao.getObjectsByHql("from dish d where d.isdisplay = false");
		System.out.println("imageurl:"+d.get(0).getImageurl());
	}

	@Test
	public void save(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dishDao = (DishDao) ctx.getBean("dishDao");
		Dish d = new Dish();
		d.setVotecount(5);
		d.setImageurl("images/food3.jpg");
		d.setName("name2");
		dishDao.saveDish(d);
	}
}
