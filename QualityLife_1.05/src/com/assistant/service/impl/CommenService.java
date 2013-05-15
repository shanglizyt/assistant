package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.ICommenDao;
import com.assistant.service.ICommenService;
import com.assistant.util.PageBean;

@Component
public class CommenService implements ICommenService {

	private ICommenDao commenDao;

	public ICommenDao getCommenDao() {
		return commenDao;
	}

	@Resource
	public void setCommenDao(ICommenDao commenDao) {
		this.commenDao = commenDao;
	}

	@Override
	public void saveObject(Object obj) {
		commenDao.saveObject(obj);
	}

	@Override
	public void updateObject(Object obj) {
		commenDao.updateObject(obj);
	}

	@Override
	public void deleteObjectById(Object obj, int id) {
		commenDao.deleteObjectById(obj, id);
	}

	@Override
	public List<?> getAllObjects(Object obj) {
		return commenDao.getAllObjects(obj);
	}

	@Override
	public Object getObjectById(Object obj, int id) {
		return commenDao.getObjectById(obj, id);
	}

	@Override
	public Object getObjectByName(Object obj, String name) {
		return commenDao.getObjectByName(obj, name);
	}

	@Override
	public PageBean queryForPage(Object obj, int pageSize, int page) {
		String obj_name = obj.getClass().getSimpleName().toLowerCase();
		String hql = "select count(*) from " + obj_name;
		int count = commenDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<?> list = commenDao.queryForPage("from " + obj_name, offset,
				length); // 该分页的记录
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
	public Object getObjectByHql(String hql) {
		return commenDao.getObjectByHql(hql);
	}

	@Override
	public List<?> getObjectsByHql(String hql) {
		return commenDao.getObjectsByHql(hql);
	}

	@Override
	public List<?> getTuiJian() {
		// 获得针对普通游客的饮食推荐
		return null;
		
	}

}
