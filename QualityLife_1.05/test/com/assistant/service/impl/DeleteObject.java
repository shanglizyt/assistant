package com.assistant.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistant.dao.impl.AdviceMenuDao;
import com.assistant.dao.impl.ArticleDao;
import com.assistant.dao.impl.CommenDao;
import com.assistant.dao.impl.CommentDao;
import com.assistant.dao.impl.ConsultDao;
import com.assistant.dao.impl.DietianAdviceDao;
import com.assistant.dao.impl.DietianDao;
import com.assistant.dao.impl.DishDao;
import com.assistant.dao.impl.FoodDao;
import com.assistant.dao.impl.RecordDao;
import com.assistant.dao.impl.TabooDao;
import com.assistant.dao.impl.UserDao;
import com.assistant.model.Commen;
import com.assistant.model.Dish;
import com.assistant.model.Food;

@SuppressWarnings("unused")
public class DeleteObject {
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
	
private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void beforeClass() {
//		new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	
	@Test
	public void deleteFood(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		foodDao = (FoodDao) ctx.getBean("foodDao");
		Food f = foodDao.getFoodById(1);
		f.setDishes(null);
		foodDao.deleteFoodById(1);
	}
	
	@Test
	public void deleteDish(){
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		dishDao = (DishDao) ctx.getBean("dishDao");
//		dishDao.deleteDishById(1);
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		Dish d = (Dish) s.load(Dish.class, 1);
		//s.save(g);
		s.delete(d);
		s.getTransaction().commit();
	}

	@Test
	public void deleteLiuyan(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		commenDao = (CommenDao) ctx.getBean("commenDao");
		@SuppressWarnings("unchecked")
		List<Commen> cs = (List<Commen>) commenDao.getAllObjects(new Commen());
		for(Commen c:cs){
			commenDao.deleteObject(c);
		}
	}
}
