package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IConsultDao;
import com.assistant.model.Consult;

@Component
public class ConsultDao extends AbstractBaseDao implements IConsultDao{

	@Override
	public void saveConsult(Consult consult) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(consult);
	}

	@Override
	public void deleteConsultById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Consult.class, id));
	}

	@Override
	public void deleteConsult(Consult consult) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(consult);
	}

	@Override
	public void updateConsult(Consult consult) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(consult);
	}

	@Override
	public Consult getConsultById(int id) {
		// TODO Auto-generated method stub
		return (Consult) this.getHibernateTemplate().load(Consult.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consult> getConsults() {
		return (List<Consult>)this.getHibernateTemplate().find("from consult");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consult> queryForPage(String hql, int offset, int length) {
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
