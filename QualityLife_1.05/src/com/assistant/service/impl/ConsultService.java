package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.ConsultDao;
import com.assistant.model.Consult;
import com.assistant.service.IConsultService;
import com.assistant.util.PageBean;

@Component
public class ConsultService implements IConsultService{
	
	private ConsultDao consultDao;
	public ConsultDao getConsultDao() {
		return consultDao;
	}

	@Resource
	public void setConsultDao(ConsultDao consultDao) {
		this.consultDao = consultDao;
	}

	@Override
	public void saveConsult(Consult consult) {
		// TODO Auto-generated method stub
		consultDao.saveConsult(consult);
	}
	
	@Override
	public void updateConsult(Consult consult) {
		// TODO Auto-generated method stub
		consultDao.updateConsult(consult);
	}
	
	@Override
	public void deleteConsultById(int id) {
		try {
			consultDao.deleteConsultById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Consult> getAllConsults() {
		return consultDao.getConsults();
	}

	@Override
	public Consult getConsultById(int id) {
		return (Consult) consultDao.getObjectById(new Consult(),id);
	}

//	@Override
//	public Consult getConsultByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from consult";
		int count = consultDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Consult> list = consultDao.queryForPage("from consult", offset, length); // 该分页的记录
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
	public Consult getConsultByHql(String hql) {
		// TODO Auto-generated method stub
		return (Consult) consultDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consult> getConsultsByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Consult>) consultDao.getObjectsByHql(hql);
	}

}
