package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.RecordDao;
import com.assistant.model.Record;
import com.assistant.service.IRecordService;
import com.assistant.util.PageBean;

@Component
public class RecordService implements IRecordService{

	private RecordDao recordDao;
	public RecordDao getRecordDao() {
		return recordDao;
	}

	@Resource
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}

	@Override
	public void saveRecord(Record record) {
		// TODO Auto-generated method stub
		recordDao.saveRecord(record);
	}
	
	@Override
	public void updateRecord(Record record) {
		// TODO Auto-generated method stub
		recordDao.updateRecord(record);
	}
	
	@Override
	public void deleteRecordById(int id) {
		try {
			recordDao.deleteRecordById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Record> getAllRecords() {
		return recordDao.getRecords();
	}

	@Override
	public Record getRecordById(int id) {
		return (Record) recordDao.getObjectById(new Record(),id);
	}

//	@Override
//	public Record getRecordByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from record";
		int count = recordDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Record> list = recordDao.queryForPage("from record", offset, length); // 该分页的记录
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
	public Record getRecordByHql(String hql) {
		// TODO Auto-generated method stub
		return (Record) recordDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Record> getRecordsByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Record>) recordDao.getObjectsByHql(hql);
	}
}
