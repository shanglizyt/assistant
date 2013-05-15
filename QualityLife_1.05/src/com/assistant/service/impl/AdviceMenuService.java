package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.AdviceMenuDao;
import com.assistant.model.AdviceMenu;
import com.assistant.service.IAdviceMenuService;
import com.assistant.util.PageBean;

@Component
public class AdviceMenuService implements IAdviceMenuService{
	
	/** 注入AdviceMenuDao*/
	private AdviceMenuDao adviceMenuDao;
	public AdviceMenuDao getAdviceMenuDao() {
		return adviceMenuDao;
	}

	@Resource
	public void setAdviceMenuDao(AdviceMenuDao adviceMenuDao) {
		this.adviceMenuDao = adviceMenuDao;
	}

//	@Override
//	public void saveAdviceMenu(AdviceMenu adviceMenu) {
//		// TODO Auto-generated method stub
//		adviceMenuDao.saveAdviceMenu(adviceMenu);
//	}
	@Override
	public void saveAdviceMenu(AdviceMenu adviceMenu) {
		// TODO Auto-generated method stub
		adviceMenuDao.saveObject(adviceMenu);
	}
	
//	@Override
//	public void updateAdviceMenu(AdviceMenu adviceMenu) {
//		// TODO Auto-generated method stub
//		adviceMenuDao.updateAdviceMenu(adviceMenu);
//	}
	@Override
	public void updateAdviceMenu(AdviceMenu adviceMenu) {
		// TODO Auto-generated method stub
		adviceMenuDao.updateObject(adviceMenu);
	}
	
//	@Override
//	public void deleteAdviceMenuById(int id) {
//		try {
//			adviceMenuDao.deleteAdviceMenuById(id);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("删除出错!");
//		}
//	}
	@Override
	public void deleteAdviceMenuById(int id) {
		try {
			adviceMenuDao.deleteObjectById(new AdviceMenu(), id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
//	@Override
//	public List<AdviceMenu> getAllAdviceMenus() {
//		return adviceMenuDao.getAdviceMenus();
//	}
	@SuppressWarnings("unchecked")
	@Override
	public List<AdviceMenu> getAllAdviceMenus() {
		return (List<AdviceMenu>) adviceMenuDao.getAllObjects(new AdviceMenu());
	}

//	@Override
//	public AdviceMenu getAdviceMenuById(int id) {
//		return adviceMenuDao.getAdviceMenuById(id);
//	}
	@Override
	public AdviceMenu getAdviceMenuById(int id) {
		return (AdviceMenu) adviceMenuDao.getObjectById(new AdviceMenu(), id);//getAdviceMenuById(id);
	}

//	@Override
//	public AdviceMenu getAdviceMenuByName(String name) {
//		// TODO Auto-generated method stub
//		List<AdviceMenu> adviceMenus = adviceMenuDao.getAdviceMenuByName(name);
//		if(!adviceMenus.isEmpty()){
//			return adviceMenus.get(0);
//		}
//		else{
//			return null;
//		}
//	}
	@SuppressWarnings("unchecked")
	@Override
	public AdviceMenu getAdviceMenuByName(String name) {
		// TODO Auto-generated method stub
		List<AdviceMenu> adviceMenus = (List<AdviceMenu>) adviceMenuDao.getObjectByName(new AdviceMenu(), name);
		if(!adviceMenus.isEmpty()){
			return adviceMenus.get(0);
		}
		else{
			return null;
		}
	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from advicemenu";
		int count = adviceMenuDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<AdviceMenu> list = (List<AdviceMenu>) adviceMenuDao.queryForPage("from advicemenu", offset, length); // 该分页的记录
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
	public AdviceMenu getAdviceMenuByHql(String hql) {
		// TODO Auto-generated method stub
		return (AdviceMenu) adviceMenuDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdviceMenu> getAdviceMenusByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<AdviceMenu>) adviceMenuDao.getObjectsByHql(hql);
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<AdviceMenu> getAdviceMenuByKouWei(int n, int kouwei) {
//		return (List<AdviceMenu>) adviceMenuDao.getObjectsByHql("select * from advicemenu where kouwei="+kouwei+" limit "+n);
//	}

}
