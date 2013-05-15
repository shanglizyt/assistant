package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.DietianAdviceDao;
import com.assistant.model.DietianAdvice;
import com.assistant.service.IDietianAdviceService;
import com.assistant.util.PageBean;

@Component
public class DietianAdviceService implements IDietianAdviceService{
	
	private DietianAdviceDao dietianAdviceDao;
	public DietianAdviceDao getDietianAdviceDao() {
		return dietianAdviceDao;
	}

	@Resource
	public void setDietianAdviceDao(DietianAdviceDao dietianAdviceDao) {
		this.dietianAdviceDao = dietianAdviceDao;
	}

	@Override
	public void saveDietianAdvice(DietianAdvice dietianAdvice) {
		// TODO Auto-generated method stub
		dietianAdviceDao.saveDietianAdvice(dietianAdvice);
	}
	
	@Override
	public void updateDietianAdvice(DietianAdvice dietianAdvice) {
		// TODO Auto-generated method stub
		dietianAdviceDao.updateDietianAdvice(dietianAdvice);
	}
	
	@Override
	public void deleteDietianAdviceById(int id) {
		try {
			dietianAdviceDao.deleteDietianAdviceById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<DietianAdvice> getAllDietianAdvices() {
		return dietianAdviceDao.getDietianAdvices();
	}

	@Override
	public DietianAdvice getDietianAdviceById(int id) {
		return (DietianAdvice) dietianAdviceDao.getObjectById(new DietianAdvice(), id);
	}

//	@Override
//	public DietianAdvice getDietianAdviceByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from dietianadvice";
		int count = dietianAdviceDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<DietianAdvice> list = dietianAdviceDao.queryForPage("from dietianadvice", offset, length); // 该分页的记录
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
	public DietianAdvice getDietianAdviceByHql(String hql) {
		// TODO Auto-generated method stub
		return (DietianAdvice) dietianAdviceDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DietianAdvice> getDietianAdvicesByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<DietianAdvice>) dietianAdviceDao.getObjectsByHql(hql);
	}

}
