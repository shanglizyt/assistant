package com.assistant.service;

import java.util.List;

import com.assistant.model.Dietian;
import com.assistant.util.PageBean;


public interface IDietianService {

	public abstract void saveDietian(Dietian dietian);
	public abstract void updateDietian(Dietian dietian);
	public abstract void deleteDietianById(int id);
	public abstract List<Dietian> getAllDietians();
	public abstract Dietian getDietianById(int id);
	public abstract Dietian getDietianByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Dietian getDietianByHql(String hql);
	public abstract List<Dietian> getDietiansByHql(String hql);
	public abstract boolean validateDietian(String name,String password);
	public abstract boolean exists(Dietian dietian);
}
