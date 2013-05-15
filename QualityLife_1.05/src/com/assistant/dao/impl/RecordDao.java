package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IRecordDao;
import com.assistant.model.Record;

@Component
public class RecordDao extends AbstractBaseDao implements IRecordDao{
	
	@Override
	public void saveRecord(Record record) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(record);
	}

	@Override
	public void deleteRecordById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Record.class, id));
	}

	@Override
	public void deleteRecord(Record record) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(record);
	}

	@Override
	public void updateRecord(Record record) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(record);
	}

	@Override
	public Record getRecordById(int id) {
		// TODO Auto-generated method stub
		return (Record) this.getHibernateTemplate().load(Record.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Record> getRecords() {
		return (List<Record>)this.getHibernateTemplate().find("from record");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Record> queryForPage(String hql, int offset, int length) {
		// TODO Auto-generated method stub
		Query q = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		q.setFirstResult(offset);
		q.setMaxResults(length);
		return q.list();
	}

	@Override
	public int getCount(String hql) {
		// TODO Auto-generated method stub
		Query q = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		return Integer.parseInt(q.list().get(0).toString());
	}

}
