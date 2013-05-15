package com.assistant.dao.impl;

import java.sql.Connection;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.assistant.dao.IBaseDao;

/** 统一数据访问接口实现 */
@Component
public class AbstractBaseDao implements IBaseDao {
	public AbstractBaseDao(){
		
	}
	
	private HibernateTemplate hibernateTemplate;
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/** 从连接池中取得一个JDBC连接 */
	@SuppressWarnings("deprecation")
	public Connection getConnection() {
		return hibernateTemplate.getSessionFactory().getCurrentSession().connection();
	}
	
	/**保存指定的对象*/
	public void saveObject(Object obj){
		this.getHibernateTemplate().save(obj);
	}

	/** 更新指定的持久化对象 */
	public void updateObject(Object obj) {
		hibernateTemplate.update(obj);
	}

	/** 保存或更新指定的持久化对象 */
	public void saveOrUpdate(Object obj) {
		hibernateTemplate.saveOrUpdate(obj);
	}
	
	/** 按照指定的类和id删除数据*/
	public void deleteObjectById(Object obj,int id){
		hibernateTemplate.delete(hibernateTemplate.load(obj.getClass(), id));
	}
	
	/** 按照指定的对象删除数据*/
	public void deleteObject(Object obj){
		hibernateTemplate.delete(obj);
	}
	
	/** 
	 * 根据指定的类和id删除数据
	 * test1 = forbid
	 * test2 = pass
	 * */
	@SuppressWarnings("unchecked")
	public Object getObjectById(Object obj,int id){
//		测试未通过
		/** 
		 * ERROR org.hibernate.LazyInitializationException:42 - could not initialize proxy - no Session
		 */
//		return hibernateTemplate.load(obj.getClass(), id);
		// 测试通过
		String obj_name = obj.getClass().getSimpleName().toLowerCase();
		List<Object> objs = hibernateTemplate.find("from "+obj_name+" o where o.id = "+id+"");
		if(objs.isEmpty()){
			System.out.println("error:method AbstractBaseDao.getObjectById() returns empty set");
			return null;
		}
		else return objs.get(0);
	}
	
	/** 
	 * 根据指定的类及对象名称得到对象
	 * test = pass
	 * */
	public List<?> getObjectByName(Object obj,String name){
		// 根据类来得到小写的数据表名obj_name
		String obj_name = obj.getClass().getSimpleName().toLowerCase();
		return hibernateTemplate.find("from "+obj_name+" o where o.name = '"+name+"'");
	}
	
	/** 
	 * 根据指定的类得到所有持久化对象
	 * test = pass
	 * */
	public List<?> getAllObjects(Object obj){
		//System.out.println("name:"+obj.getClass());
		return hibernateTemplate.loadAll(obj.getClass());
	}
	
	/** 按页得到某关系模式的若干元组*/
	@Override
	public List<?> queryForPage(String hql, int offset, int length) {
		Query q = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		q.setFirstResult(offset);
		q.setMaxResults(length);
		return q.list();
	}

	/** 
	 * 得到某关系模式中数据总数
	 *  返回数据总数
	 * */
	@Override
	public int getCount(String hql) {
		Query q = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		return Integer.parseInt(q.list().get(0).toString());
	}

	/** 
	 * 根据指定的hql得到某持久化对象
	 * 返回一个对象
	 * */
	@Override
	public Object getObjectByHql(String hql) {
		return this.getHibernateTemplate().find(hql).get(0);
	}

	/** 
	 * 根据指定的hql得到某持久化对象集合
	 * 返回对象集
	 * */
	@Override
	public List<?> getObjectsByHql(String hql) {
		return this.getHibernateTemplate().find(hql);
	}
}