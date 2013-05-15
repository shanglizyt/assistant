package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.TabooDao;
import com.assistant.model.Taboo;
import com.assistant.service.ITabooService;
import com.assistant.util.PageBean;

@Component
public class TabooService implements ITabooService {

	private TabooDao tabooDao;
	public TabooDao getTabooDao() {
		return tabooDao;
	}

	@Resource
	public void setTabooDao(TabooDao tabooDao) {
		this.tabooDao = tabooDao;
	}

	@Override
	public void saveTaboo(Taboo taboo) {
		// TODO Auto-generated method stub
		tabooDao.saveTaboo(taboo);
	}
	
	@Override
	public void updateTaboo(Taboo taboo) {
		// TODO Auto-generated method stub
		tabooDao.updateTaboo(taboo);
	}
	
	@Override
	public void deleteTabooById(int id) {
		try {
			tabooDao.deleteTabooById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Taboo> getAllTaboos() {
		return tabooDao.getTaboos();
	}

	@Override
	public Taboo getTabooById(int id) {
		return (Taboo) tabooDao.getObjectById(new Taboo(),id);
	}

//	@Override
//	public Taboo getTabooByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from taboo";
		int count = tabooDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Taboo> list = tabooDao.queryForPage("from taboo", offset, length); // 该分页的记录
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
	public Taboo getTabooByHql(String hql) {
		// TODO Auto-generated method stub
		return (Taboo) tabooDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Taboo> getTaboosByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Taboo>) tabooDao.getObjectsByHql(hql);
	}
}
