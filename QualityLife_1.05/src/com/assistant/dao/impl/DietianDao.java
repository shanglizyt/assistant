package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IDietianDao;
import com.assistant.model.Dietian;

@Component
public class DietianDao extends AbstractBaseDao implements IDietianDao{

	@Override
	public void saveDietian(Dietian dietian) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dietian);
	}

	@Override
	public void deleteDietianById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Dietian.class, id));
	}

	@Override
	public void deleteDietian(Dietian dietian) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(dietian);
	}

	@Override
	public void updateDietian(Dietian dietian) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(dietian);
	}

	@Override
	public Dietian getDietianById(int id) {
		// TODO Auto-generated method stub
		return (Dietian) this.getHibernateTemplate().load(Dietian.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dietian> getDietianByName(String name) {
		List<Dietian> dietian = this.getHibernateTemplate().find("from dietian d where d.name = '" + name + "'");
		return dietian;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dietian> getDietians() {
		return (List<Dietian>)this.getHibernateTemplate().find("from dietian");
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkDietianExistsWithName(String name) {
		List<Dietian> dietians = this.getHibernateTemplate().find("from dietian d where d.name = '" + name + "'");
		if(dietians != null && dietians.size() > 0) {
			return true;           
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dietian> queryForPage(String hql, int offset, int length) {
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
