package com.assistant.dao.impl;

import org.hibernate.Hibernate;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistant.model.AdviceMenu;

public class AdviceMenuDaoImplTest {

	private AdviceMenuDao advMenDao;

	@Test
	public void setUp() throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		advMenDao = (AdviceMenuDao) ctx.getBean("adviceMenuDao");
		// System.out.println(advMenDao.getClass().getName());
		AdviceMenu menu = new AdviceMenu();
		menu.setMiaoshu("hahahahaha");
		// menu.setId(0);
		menu.setName("my");
		advMenDao.saveObject(menu);
	}

	@Test
	public void getAllAdV() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		advMenDao = (AdviceMenuDao) ctx.getBean("adviceMenuDao");
		// System.out.println("class:"+AdviceMenu.class);
		AdviceMenu adv = null;
		Hibernate.initialize(adv);
		adv = (AdviceMenu) advMenDao.getObjectById(new AdviceMenu(),1);//getAdviceMenuById(1);
		System.out.println("miaoshu:"+adv.getMiaoshu());
//		List<AdviceMenu> lad = (List<AdviceMenu>)advMenDao.getAllObjects(new AdviceMenu());//getAdviceMenuById(1);//getObjectByName(new AdviceMenu(), "my");//getAdviceMenus();//getAdviceMenuByName("my");//getObjectById(new AdviceMenu(), 1);
//		System.out.println("miaoshu:"+lad.get(0).getMiaoshu());
//		List<AdviceMenu> lad = (List<AdviceMenu>) advMenDao.getObjectByName(new AdviceMenu(), "my");//getAllObjects(new AdviceMenu());
//		System.out.println(lad);
//		for(AdviceMenu ad: lad){
//			System.out.println(ad.getMiaoshu());//getName());
//		}
	}
	
	@Test
	public void deladv(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		advMenDao = (AdviceMenuDao) ctx.getBean("adviceMenuDao");
		advMenDao.deleteObjectById(new AdviceMenu(), 1);
	}

	/*
	 * @Before public void getDao() {
	 * 
	 * // 这个要根据需要进行修改，在classes路径中去寻找配置文件。
	 * 
	 * beanFactory = new ClassPathXmlApplicationContext(
	 * "/QualityLife_1.01/src/beans.xml");
	 * 
	 * advMenDao = (AdviceMenuDaoImpl) beanFactory.getBean("adviceMenuDao");
	 * 
	 * }
	 */
	/*
	 * @Test public void testXxx() { // 你要具体测试的方法。 AdviceMenu menu = new
	 * AdviceMenu(); menu.setDescription("hahahahaha"); menu.setId(0);
	 * menu.setName("my"); advMenDao.save(menu); advMenDao.findById(getClass(),
	 * 0); menu = (AdviceMenu) advMenDao.findById(getClass(), 1);
	 * System.out.println(menu); advMenDao.deleteById(1); }
	 */

	@Test
	public void testGetAdviceMenuByLoadId(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		advMenDao = (AdviceMenuDao) ctx.getBean("adviceMenuDao");
		AdviceMenu adv = advMenDao.getAdviceMenuByLoadId(0);
		System.out.println("name:"+adv.getName());
	}
}
