package com.assistant.service;

import java.util.List;

import com.assistant.model.Record;
import com.assistant.util.PageBean;

public interface IRecordService {
	
	public abstract void saveRecord(Record record);
	public abstract void updateRecord(Record record);
	public abstract void deleteRecordById(int id);
	public abstract List<Record> getAllRecords();
	public abstract Record getRecordById(int id);
	// public abstract Record getRecordByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Record getRecordByHql(String hql);
	public abstract List<Record> getRecordsByHql(String hql);

}
