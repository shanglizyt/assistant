package com.assistant.service;

import java.util.List;

import com.assistant.model.Dish;
import com.assistant.util.PageBean;

public interface IDishService {
	
	public abstract void saveDish(Dish dish);
	public abstract void updateDish(Dish dish);
	public abstract void deleteDishById(int id);
	public abstract List<Dish> getAllDishs();
	public abstract Dish getDishById(int id);
	public abstract Dish getDishByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Dish getDishByHql(String hql);
	public abstract List<Dish> getDishsByHql(String hql);
	public abstract List<Dish> getTop5();
	public abstract List<Dish> getDishByKouWei(int i, int kouwei);

}
