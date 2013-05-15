package com.assistant.service.impl;

import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistant.dao.impl.AdviceMenuDao;
import com.assistant.dao.impl.ArticleDao;
import com.assistant.dao.impl.CommentDao;
import com.assistant.dao.impl.ConsultDao;
import com.assistant.dao.impl.DietianAdviceDao;
import com.assistant.dao.impl.DietianDao;
import com.assistant.dao.impl.DishDao;
import com.assistant.dao.impl.FoodDao;
import com.assistant.dao.impl.RecordDao;
import com.assistant.dao.impl.TabooDao;
import com.assistant.dao.impl.UserDao;
import com.assistant.model.Article;
import com.assistant.model.Comment;
import com.assistant.model.Dish;
import com.assistant.model.Food;

@SuppressWarnings("unused")
public class GetObject {

	private static AdviceMenuDao adviceMenuDao;
	private static ArticleDao articleDao;
	private static CommentDao commentDao;
	private static ConsultDao consultDao;
	private static DietianDao dietianDao;
	private static DietianAdviceDao dietianAdviceDao;
	private static DishDao dishDao;
	private static FoodDao foodDao;
	private static RecordDao recordDao;
	private static TabooDao tabooDao;
	private static UserDao userDao;
	
	@Test
	public void getDish(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dishDao = (DishDao) ctx.getBean("dishDao");
//		foodDao = (FoodDao) ctx.getBean("foodDao");
		Dish d = (Dish) dishDao.getObjectById(new Dish(),1);
		System.out.println("dish:"+d.getName());
		Set<Food> foods = (Set<Food>)d.getFoods();
		Food[] foods2 = foods.toArray(new Food[0]);
		System.out.println("dish_food:"+foods2[0].getName());
		//System.out.println("dish_food:"+foods2[1].getName());
//		d.setName("dish1");
//		Food[] f = (Food[]) d.getFoods().toArray();
//		d.getFoods().add(f);
//		dishDao.saveDish(d);
//		System.out.println("food:"+f[0].getName());
	}
	
	@Test
	public void getFood(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		foodDao = (FoodDao) ctx.getBean("foodDao");
		Food f = (Food) foodDao.getObjectById(new Food(),3);
		System.out.println(f.getName());
	}

	@Test
	public void getArticle(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		articleDao = (ArticleDao) ctx.getBean("articleDao");
		Article a = articleDao.getArticleByLoadId(1);
		System.out.println("title:"+a.getTitle());
	}
	
	@Test
	public void getComment(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		commentDao=(CommentDao)ctx.getBean("commentDao");
		//Comment c = (Comment) commentDao.getAllObjects(new Comment()).get(0);
		Comment c = (Comment) commentDao.getObjectById(new Comment(), 1);
		//System.out.println(c);
		System.out.println(c.getTitle());
		System.out.println(c.getUser().getName());
	}
	
}
