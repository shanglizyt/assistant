package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IFoodDao;
import com.assistant.model.Food;

@Component
public class FoodDao extends AbstractBaseDao implements IFoodDao{
		
	@Override
	public void saveFood(Food food) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(food);
	}

	@Override
	public void deleteFoodById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Food.class, id));
	}

	@Override
	public void deleteFood(Food food) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(food);
	}

	@Override
	public void updateFood(Food food) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(food);
	}

	@Override
	public Food getFoodById(int id) {
		// TODO Auto-generated method stub
		return (Food) this.getHibernateTemplate().load(Food.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Food> getFoodByName(String name) {
		List<Food> food = this.getHibernateTemplate().find("from food f where f.name = '" + name + "'");
		return food;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Food> getFoods() {
		return (List<Food>)this.getHibernateTemplate().find("from food");
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkFoodExistsWithName(String name) {
		List<Food> foods = this.getHibernateTemplate().find("from food f where f.name = '" + name + "'");
		if(foods != null && foods.size() > 0) {
			return true;           
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Food> queryForPage(String hql, int offset, int length) {
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
