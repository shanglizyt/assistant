package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.FoodDao;
import com.assistant.model.Food;
import com.assistant.service.IFoodService;
import com.assistant.util.PageBean;

@Component
public class FoodService implements IFoodService{
	
	private FoodDao foodDao;
	public FoodDao getFoodDao() {
		return foodDao;
	}

	@Resource
	public void setFoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;
	}

	@Override
	public void saveFood(Food food) {
		// TODO Auto-generated method stub
		foodDao.saveFood(food);
	}
	
	@Override
	public void updateFood(Food food) {
		// TODO Auto-generated method stub
		foodDao.updateFood(food);
	}
	
	@Override
	public void deleteFoodById(int id) {
		try {
			foodDao.deleteFoodById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Food> getAllFoods() {
		return foodDao.getFoods();
	}

	@Override
	public Food getFoodById(int id) {
		return (Food) foodDao.getObjectById(new Food(),id);
	}

	@Override
	public Food getFoodByName(String name) {
		// TODO Auto-generated method stub
		List<Food> foods = foodDao.getFoodByName(name);
		if(!foods.isEmpty()){
			return foods.get(0);
		}
		else{
			return null;
		}
	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from food";
		int count = foodDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Food> list = foodDao.queryForPage("from food", offset, length); // 该分页的记录
		// 把分页信息保存到Bean中
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(count);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}

	@Override
	public Food getFoodByHql(String hql) {
		// TODO Auto-generated method stub
		return (Food) foodDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Food> getFoodsByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Food>) foodDao.getObjectsByHql(hql);
	}

}
