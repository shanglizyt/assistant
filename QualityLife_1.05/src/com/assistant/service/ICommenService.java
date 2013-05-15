package com.assistant.service;

import java.util.List;

import com.assistant.util.PageBean;

public interface ICommenService {
	public abstract void saveObject(Object obj);
	public abstract void updateObject(Object obj);
	public abstract void deleteObjectById(Object obj,int id);
	public abstract List<?> getAllObjects(Object obj);
	public abstract Object getObjectById(Object obj,int id);
	public abstract Object getObjectByName(Object obj,String name);
	public abstract PageBean queryForPage(Object obj,int pageSize, int page);
	public abstract Object getObjectByHql(String hql);
	public abstract List<?> getObjectsByHql(String hql);
	public abstract List<?> getTuiJian();
}
