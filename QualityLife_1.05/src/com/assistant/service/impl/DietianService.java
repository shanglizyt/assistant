package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.DietianDao;
import com.assistant.model.Dietian;
import com.assistant.service.IDietianService;
import com.assistant.util.PageBean;

@Component
public class DietianService implements IDietianService{
	
	private DietianDao dietianDao;
	public DietianDao getDietianDao() {
		return dietianDao;
	}

	@Resource
	public void setDietianDao(DietianDao dietianDao) {
		this.dietianDao = dietianDao;
	}

	@Override
	public void saveDietian(Dietian dietian) {
		// TODO Auto-generated method stub
		dietianDao.saveDietian(dietian);
	}
	
	@Override
	public void updateDietian(Dietian dietian) {
		// TODO Auto-generated method stub
		dietianDao.updateDietian(dietian);
	}
	
	@Override
	public void deleteDietianById(int id) {
		try {
			dietianDao.deleteDietianById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Dietian> getAllDietians() {
		return dietianDao.getDietians();
	}

	@Override
	public Dietian getDietianById(int id) {
		return (Dietian) dietianDao.getObjectById(new Dietian(),id);
	}

	@Override
	public Dietian getDietianByName(String name) {
		// TODO Auto-generated method stub
		List<Dietian> dietians = dietianDao.getDietianByName(name);
		if(!dietians.isEmpty()){
			return dietians.get(0);
		}
		else{
			return null;
		}
	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from dietian";
		int count = dietianDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Dietian> list = dietianDao.queryForPage("from dietian", offset, length); // 该分页的记录
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
	public Dietian getDietianByHql(String hql) {
		// TODO Auto-generated method stub
		return (Dietian) dietianDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dietian> getDietiansByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Dietian>) dietianDao.getObjectsByHql(hql);
	}
	
	public boolean validateDietian(String name,String password){
		List<Dietian> dietians = dietianDao.getDietianByName(name);
		if(dietians!=null&&dietians.size()!=0){
			if(dietians.get(0).getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean exists(Dietian dietian) {
		// TODO Auto-generated method stub
		return dietianDao.checkDietianExistsWithName(dietian.getName());
	}

}
