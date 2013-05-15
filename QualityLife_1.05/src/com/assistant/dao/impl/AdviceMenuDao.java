package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;
import com.assistant.dao.IAdviceMenuDao;
import com.assistant.model.AdviceMenu;

@Component
public class AdviceMenuDao extends AbstractBaseDao implements IAdviceMenuDao{

	@Override
	public void saveAdviceMenu(AdviceMenu adviceMenu) {
		this.getHibernateTemplate().save(adviceMenu);
	}

	@Override
	public void deleteAdviceMenuById(int id) {
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(AdviceMenu.class, id));
	}

	@Override
	public void deleteAdviceMenu(AdviceMenu adviceMenu) {
		this.getHibernateTemplate().delete(adviceMenu);
	}

	@Override
	public void updateAdviceMenu(AdviceMenu adviceMenu) {
		this.getHibernateTemplate().update(adviceMenu);
	}

	@Override
	public AdviceMenu getAdviceMenuById(int id) {
		// System.out.println("id:"+id);
		// return (AdviceMenu) this.getHibernateTemplate().load(new AdviceMenu().getClass(), id);
		// return (AdviceMenu) this.getHibernateTemplate().find("from advicemenu o where o.id = "+id+"").get(0);
		return (AdviceMenu) this.getObjectById(new AdviceMenu(), id);
	}
	
	public AdviceMenu getAdviceMenuByLoadId(int id){
		return (AdviceMenu) this.getHibernateTemplate().load(AdviceMenu.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AdviceMenu> getAdviceMenuByName(String name) {
		List<AdviceMenu> advicemenu = this.getHibernateTemplate().find("from advicemenu am where am.name = '" + name + "'");
		return advicemenu;
	}

	@SuppressWarnings("unchecked")
	public List<AdviceMenu> getAdviceMenus() {
		return (List<AdviceMenu>)this.getHibernateTemplate().find("from advicemenu");
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkAdviceMenuExistsWithName(String name) {
		List<AdviceMenu> advicemenus = this.getHibernateTemplate().find("from advicemenu am where am.name = '" + name + "'");
		if(advicemenus != null && advicemenus.size() > 0) {
			return true;           
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdviceMenu> queryForPage(String hql, int offset, int length) {
		Query q = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		q.setFirstResult(offset);
		q.setMaxResults(length);
		return q.list();
	}

	@Override
	public int getCount(String hql) {
		Query q = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		return Integer.parseInt(q.list().get(0).toString());
	}

//	@Override
//	public AdviceMenu getAdviceMenuByHql(String hql) {
//		// TODO Auto-generated method stub
//		return (AdviceMenu) this.getHibernateTemplate().find(hql);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<AdviceMenu> getAdviceMenusByHql(String hql) {
//		// TODO Auto-generated method stub
//		return this.getHibernateTemplate().find(hql);
//	}

}
