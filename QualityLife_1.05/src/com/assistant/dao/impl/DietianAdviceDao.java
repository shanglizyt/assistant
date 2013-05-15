package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IDietianAdviceDao;
import com.assistant.model.DietianAdvice;

@Component
public class DietianAdviceDao extends AbstractBaseDao implements IDietianAdviceDao{

	@Override
	public void saveDietianAdvice(DietianAdvice dietianAdvice) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dietianAdvice);
	}

	@Override
	public void deleteDietianAdviceById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(DietianAdvice.class, id));
	}

	@Override
	public void deleteDietianAdvice(DietianAdvice dietianAdvice) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(dietianAdvice);
	}

	@Override
	public void updateDietianAdvice(DietianAdvice dietianAdvice) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(dietianAdvice);
	}

	@Override
	public DietianAdvice getDietianAdviceById(int id) {
		// TODO Auto-generated method stub
		return (DietianAdvice) this.getHibernateTemplate().load(DietianAdvice.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DietianAdvice> getDietianAdvices() {
		return (List<DietianAdvice>)this.getHibernateTemplate().find("from dietianadvice");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DietianAdvice> queryForPage(String hql, int offset, int length) {
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
