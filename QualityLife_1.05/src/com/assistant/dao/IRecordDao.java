
/*操作数据库，定义对数据库表Record的增删改查等方法*/

package com.assistant.dao;

import java.util.List;

import com.assistant.model.Record;

public interface IRecordDao extends IBaseDao {
	public abstract void saveRecord(Record record);
	public abstract void updateRecord(Record record);
	public abstract void deleteRecordById(int id);
	public abstract void deleteRecord(Record record);
	public abstract Record getRecordById(int id);
	// public abstract List<Record> getRecordByName(String name);
	public abstract List<Record> getRecords();
	// public abstract boolean checkRecordExistsWithName(String record_name);
	/**/
	public List<Record> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
	
}
