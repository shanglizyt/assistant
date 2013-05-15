package com.assistant.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistant.dao.impl.*;
import com.assistant.model.*;

@SuppressWarnings("unused")
public class SaveObject {
	private static AdviceMenuDao adviceMenuDao;
	private static ArticleDao articleDao;
	private static CommenDao commenDao;
	private static CommentDao commentDao;
	private static ConsultDao consultDao;
	private static DietianDao dietianDao;
	private static DietianAdviceDao dietianAdviceDao;
	private static DishDao dishDao;
	private static FoodDao foodDao;
	private static RecordDao recordDao;
	private static TabooDao tabooDao;
	private static UserDao userDao;

	/**
	 * @param args
	 * @return 
	 */
	@Test
	public void saveComment() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		commentDao = (CommentDao) ctx.getBean("commentDao");
		userDao = (UserDao) ctx.getBean("userDao");
		Comment comment = new Comment();
		comment.setTitle("评论标题1");
		User commenter =  userDao.getUserByName("u1").get(0);
		comment.setUser(commenter);
		commentDao.saveComment(comment);
	}
	
	@Test
	public void saveDish(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dishDao = (DishDao) ctx.getBean("dishDao");
		foodDao = (FoodDao) ctx.getBean("foodDao");
		Dish d = new Dish();
		d.setName("dish1");
		d.setImageurl("images/food1.jpg");
		Food f = foodDao.getFoods().get(0);
		d.getFoods().add(f);
		dishDao.saveDish(d);
	}
	
	@Test
	public void updateDish(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dishDao = (DishDao) ctx.getBean("dishDao");
		foodDao = (FoodDao) ctx.getBean("foodDao");
		Food f = foodDao.getFoodByName("food2").get(0);
		Dish d = (Dish) dishDao.getObjectById(new Dish(), 1);
		d.getFoods().add(f);
		dishDao.updateDish(d);
	}
	
	@Test
	public void updateFood(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		foodDao = (FoodDao) ctx.getBean("foodDao");
		Food f = foodDao.getFoodByName("food1").get(0);
		Element e = new Element();
		e.setAmount((float) 11.6);
		e.setName("维生素B");
		e.setStandard("mg");
		e.setUnit("100g");
		f.getElements().add(e);
		foodDao.updateFood(f);
	}
	
	@Test
	public void saveFood(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		foodDao = (FoodDao) ctx.getBean("foodDao");
		Food f = new Food();
		f.setName("食物名称1");
		f.setImageurl("images/food1.jpg");
		foodDao.saveFood(f);
	}

	@Test
	public void savaUser(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		userDao = (UserDao) ctx.getBean("userDao");
		User u = new User();
		u.setName("u1");
		u.setPassword("123");
		u.setAge(18);
		u.setInfo_complete(0);
		u.setImageurl("images/touxiang.png");
		userDao.saveUser(u);
	}
	
	@Test
	public void savaTaboo(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		tabooDao = (TabooDao) ctx.getBean("tabooDao");
//		foodDao = (FoodDao) ctx.getBean("foodDao");
		Taboo t = new Taboo();
		t.setTitle("夏季注意饮食搭配");
		t.setContent("饮食禁忌的内容一");
//		Food f = foodDao.getFoods().get(0);
//		t.getFoods().add(f);
		tabooDao.saveTaboo(t);
	}
	
	@Test
	public void saveAdviceMenu(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		adviceMenuDao = (AdviceMenuDao) ctx.getBean("adviceMenuDao");
		AdviceMenu adv = new AdviceMenu();
		adv.setName("推荐菜谱1");
		adv.setImageurl("images/food7.jpg");
		adviceMenuDao.saveAdviceMenu(adv);
	}
	
	@Test
	public void saveArticle(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		articleDao = (ArticleDao) ctx.getBean("articleDao");
		Article a = new Article();
		a.setTitle("文章标题一");
		articleDao.saveArticle(a);
	}
	
	@Test
	public void saveDietian(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dietianDao = (DietianDao)ctx.getBean("dietianDao");
		Dietian d = new Dietian();
		d.setName("y1");
		d.setPassword("123");
		d.setImageurl("images/touxiang.png");
		dietianDao.saveDietian(d);
	}
	
	@Test
	public void saveLiuyan(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		commenDao = (CommenDao)ctx.getBean("commenDao");
		LiuYan ly = new LiuYan();
		ly.setUserName("饮食达人");
		ly.setContent("健康饮食，关注合盛呦~");
		ly.setDate("04-11");
		commenDao.saveObject(ly);
	}
	
	@Test
	public void initialize(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		this.savaUser();
		this.saveComment();
		this.saveArticle();
		this.saveFood();
		this.saveDish();
		this.saveDietian();
		this.saveAdviceMenu();
		this.savaTaboo();
		this.saveDietian();
	}
}
