package com.assistant.dao;

import java.util.List;

import com.assistant.model.Taboo;

public interface ITabooDao extends IBaseDao {

	public abstract void saveTaboo(Taboo taboo);
	public abstract void updateTaboo(Taboo taboo);
	public abstract void deleteTabooById(int id);
	public abstract void deleteTaboo(Taboo taboo);
	public abstract Taboo getTabooById(int id);
	// public abstract List<Taboo> getTabooByName(String name);
	public abstract List<Taboo> getTaboos();
	// public abstract boolean checkTabooExistsWithName(String taboo_name);
	/**/
	public List<Taboo> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
}
