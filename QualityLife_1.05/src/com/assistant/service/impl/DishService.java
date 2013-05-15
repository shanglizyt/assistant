package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.DishDao;
import com.assistant.model.Dish;
import com.assistant.service.IDishService;
import com.assistant.util.PageBean;

@Component
public class DishService implements IDishService{

	private DishDao dishDao;
	public DishDao getDishDao() {
		return dishDao;
	}

	@Resource
	public void setDishDao(DishDao dishDao) {
		this.dishDao = dishDao;
	}

	@Override
	public void saveDish(Dish dish) {
		// TODO Auto-generated method stub
		dishDao.saveDish(dish);
	}
	
	@Override
	public void updateDish(Dish dish) {
		// TODO Auto-generated method stub
		dishDao.updateDish(dish);
	}
	
	@Override
	public void deleteDishById(int id) {
		try {
			dishDao.deleteDishById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Dish> getAllDishs() {
		return dishDao.getDishs();
	}

	@Override
	public Dish getDishById(int id) {
		return (Dish) dishDao.getObjectById(new Dish(),id);
	}

	@Override
	public Dish getDishByName(String name) {
		// TODO Auto-generated method stub
		List<Dish> dishes = dishDao.getDishByName(name);
		if(!dishes.isEmpty()){
			return dishes.get(0);
		}
		else{
			return null;
		}
	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from dish";
		int count = dishDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Dish> list = dishDao.queryForPage("from dish", offset, length); // 该分页的记录
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
	public Dish getDishByHql(String hql) {
		// TODO Auto-generated method stub
		return (Dish) dishDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> getDishsByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Dish>) dishDao.getObjectsByHql(hql);
	}
	
	public List<Dish> getTop5(){
		return dishDao.getDishTop5();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> getDishByKouWei(int i, int kouwei) {
		return (List<Dish>) dishDao.getObjectsByHql("select * from dish where kouwei="+kouwei+" limit "+i);
	}
}
