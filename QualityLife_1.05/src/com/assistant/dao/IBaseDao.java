package com.assistant.dao;

import java.util.*;

/** 统一数据访问接口 */
public interface IBaseDao {
	
	/**保存指定的对象*/
	public abstract void saveObject(Object obj);

	/** 更新指定的持久化对象 */
	public abstract void updateObject(Object obj);

	/** 保存或更新指定的持久化对象 */
	public abstract void saveOrUpdate(Object obj);
	
	/** 按照指定的类和id删除数据*/
	public abstract void deleteObjectById(Object obj,int id);
	
	/** 按照指定的对象删除数据*/
	public abstract void deleteObject(Object obj);
	
	/** 根据指定的类和id删除数据*/
	public abstract Object getObjectById(Object obj,int id);
	
	/** 根据指定的类及对象名称得到对象*/
	@SuppressWarnings("rawtypes")
	public abstract List getObjectByName(Object obj,String name);
	
	/** 根据指定的类得到所有持久化对象*/
	public abstract List<?> getAllObjects(Object obj);
	
	/** 按页得到某关系模式的若干元组*/
	@SuppressWarnings("rawtypes")
	public abstract List queryForPage(String hql, int offset, int length);

	/** 得到某关系模式中数据总数*/
	public abstract int getCount(String hql);

	/** 根据指定的hql得到某持久化对象*/
	public abstract Object getObjectByHql(String hql);

	/** 根据指定的hql得到某持久化对象集合*/
	@SuppressWarnings("rawtypes")
	public abstract List getObjectsByHql(String hql);
}
