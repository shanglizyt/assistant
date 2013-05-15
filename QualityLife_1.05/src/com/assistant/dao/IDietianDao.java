package com.assistant.dao;

import java.util.List;

import com.assistant.model.Dietian;

public interface IDietianDao extends IBaseDao{
	public abstract void saveDietian(Dietian dietian);
	public abstract void updateDietian(Dietian dietian);
	public abstract void deleteDietianById(int id);
	public abstract void deleteDietian(Dietian dietian);
	public abstract Dietian getDietianById(int id);
	public abstract List<Dietian> getDietianByName(String name);
	public abstract List<Dietian> getDietians();
	public abstract boolean checkDietianExistsWithName(String dietian_name);
	/**/
	public List<Dietian> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
}
