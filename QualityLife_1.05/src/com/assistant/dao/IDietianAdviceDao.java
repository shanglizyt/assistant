package com.assistant.dao;

import java.util.List;

import com.assistant.model.DietianAdvice;

public interface IDietianAdviceDao extends IBaseDao{
	public abstract void saveDietianAdvice(DietianAdvice dietianadvice);
	public abstract void updateDietianAdvice(DietianAdvice dietianadvice);
	public abstract void deleteDietianAdviceById(int id);
	public abstract void deleteDietianAdvice(DietianAdvice dietianadvice);
	public abstract DietianAdvice getDietianAdviceById(int id);
	// public abstract List<DietianAdvice> getDietianAdviceByName(String name);
	public abstract List<DietianAdvice> getDietianAdvices();
	// public abstract boolean checkDietianAdviceExistsWithName(String dietianadvice_name);
	/**/
	public List<DietianAdvice> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
}
