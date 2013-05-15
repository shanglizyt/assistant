package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IDishDao;
import com.assistant.model.Dish;

@Component
public class DishDao extends AbstractBaseDao implements IDishDao{
	
	@Override
	public void saveDish(Dish dish) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dish);
	}

	@Override
	public void deleteDishById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Dish.class, id));
	}

	@Override
	public void deleteDish(Dish dish) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(dish);
	}

	@Override
	public void updateDish(Dish dish) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(dish);
	}

	@Override
	public Dish getDishById(int id) {
		// TODO Auto-generated method stub
		return (Dish) this.getHibernateTemplate().load(Dish.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> getDishByName(String name) {
		List<Dish> dish = this.getHibernateTemplate().find("from dish d where d.name = '" + name + "'");
		return dish;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> getDishs() {
		return (List<Dish>)this.getHibernateTemplate().find("from dish");
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkDishExistsWithName(String name) {
		List<Dish> dishs = this.getHibernateTemplate().find("from dish d where d.name = '" + name + "'");
		if(dishs != null && dishs.size() > 0) {
			return true;           
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> queryForPage(String hql, int offset, int length) {
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

	@SuppressWarnings("unchecked")
	public List<Dish> getDishTop5() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from dish d order by d.votecount desc limit 5");
	}

}
