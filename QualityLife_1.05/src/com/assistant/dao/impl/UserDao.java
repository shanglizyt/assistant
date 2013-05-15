package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IUserDao;
import com.assistant.model.User;

@Component
public class UserDao extends AbstractBaseDao implements IUserDao{
	
	@Override
	public void saveUser(User user) {
		//System.out.println("UserDao:saveDao");
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void deleteUserById(int id) {
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(User.class, id));
	}

	@Override
	public void deleteUser(User user) {
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);
	}

	@Override
	public User getUserById(int id) {
		return (User) this.getHibernateTemplate().load(User.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserByName(String name) {
		List<User> user = this.getHibernateTemplate().find("from user u where u.name = '" + name + "'");
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		return (List<User>)this.getHibernateTemplate().find("from user");
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkUserExistsWithName(String name) {
		List<User> users = this.getHibernateTemplate().find("from user u where u.name = '" + name + "'");
		if(users != null && users.size() > 0) {
			return true;           
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryForPage(String hql, int offset, int length) {
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
}
