package com.assistant.service;

import java.util.List;

import com.assistant.model.DietianAdvice;
import com.assistant.util.PageBean;

public interface IDietianAdviceService {

	public abstract void saveDietianAdvice(DietianAdvice dietianAdvice);
	public abstract void updateDietianAdvice(DietianAdvice dietianAdvice);
	public abstract void deleteDietianAdviceById(int id);
	public abstract List<DietianAdvice> getAllDietianAdvices();
	public abstract DietianAdvice getDietianAdviceById(int id);
	// public abstract DietianAdvice getDietianAdviceByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract DietianAdvice getDietianAdviceByHql(String hql);
	public abstract List<DietianAdvice> getDietianAdvicesByHql(String hql);

}
