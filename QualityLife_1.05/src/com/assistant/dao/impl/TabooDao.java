package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.ITabooDao;
import com.assistant.model.Taboo;

@Component
public class TabooDao extends AbstractBaseDao implements ITabooDao {

	@Override
	public void saveTaboo(Taboo taboo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(taboo);
	}

	@Override
	public void deleteTabooById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Taboo.class, id));
	}

	@Override
	public void deleteTaboo(Taboo taboo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(taboo);
	}

	@Override
	public void updateTaboo(Taboo taboo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(taboo);
	}

	@Override
	public Taboo getTabooById(int id) {
		// TODO Auto-generated method stub
		return (Taboo) this.getHibernateTemplate().load(Taboo.class, id);
	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Taboo> getTabooByName(String name) {
//		List<Taboo> taboo = this.getHibernateTemplate().find("from taboo f where f.name = '" + name + "'");
//		return taboo;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Taboo> getTaboos() {
		return (List<Taboo>)this.getHibernateTemplate().find("from taboo");
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean checkTabooExistsWithName(String name) {
//		List<Taboo> taboos = this.getHibernateTemplate().find("from taboo f where f.name = '" + name + "'");
//		if(taboos != null && taboos.size() > 0) {
//			return true;           
//		}
//		return false;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Taboo> queryForPage(String hql, int offset, int length) {
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
