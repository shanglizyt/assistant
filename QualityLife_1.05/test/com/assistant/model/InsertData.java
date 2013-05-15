package com.assistant.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InsertData {
	private static SessionFactory sessionFactory;
	@BeforeClass
	public static void beforeClass() {
		// new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	
	@Test
	public void Insert(){
		// UserService userService = new UserService();
		// String sql = "insert into user (name,age) values ('A',21),('B',22),('C',23)";
		// sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		User u = new User();
		User u2 = new User();
		AdviceMenu am = new AdviceMenu();
		am.setName("ex2");
		u.setName("B");
		u.setAge(20);
		u2.setName("C");
		u2.getAdvicemenus().add(am);
		u.getAdvicemenus().add(am);
		s.save(u);
		s.save(u2);
		s.getTransaction().commit();
	}
	@Test
	public void Delete(){
		// Insert();
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		User u = (User) s.get(User.class,18);
//		s.getTransaction().commit();
//		System.out.println(u.getName());
		
//		System.out.println(u.getName());
//		for(AdviceMenu a:u.getAdvicemenu()){
//			System.out.println("name:"+a.getName());
//		}
		//AdviceMenu[] a = (AdviceMenu[]) u.getAdvicemenu().toArray();
		
		// 删除时破坏级联关系，则不会删除与之相关的对象
		// u.getAdvicemenu().clear();
		s.delete(u);
		s.getTransaction().commit();
	}
	@Test
	public void insert_taboo(){
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		Taboo t = new Taboo();
		t.setTitle("测试禁忌2");
		s.save(t);
		s.getTransaction().commit();
	}
}
