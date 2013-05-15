package com.assistant.service;

import java.util.List;

import com.assistant.model.Food;
import com.assistant.util.PageBean;

public interface IFoodService {
	
	public abstract void saveFood(Food food);
	public abstract void updateFood(Food food);
	public abstract void deleteFoodById(int id);
	public abstract List<Food> getAllFoods();
	public abstract Food getFoodById(int id);
	public abstract Food getFoodByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Food getFoodByHql(String hql);
	public abstract List<Food> getFoodsByHql(String hql);

}
