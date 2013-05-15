package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.ICommentDao;
import com.assistant.model.Comment;

@Component
public class CommentDao extends AbstractBaseDao implements ICommentDao{

	@Override
	public void saveComment(Comment comment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(comment);
	}

	@Override
	public void deleteCommentById(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Comment.class, id));
	}

	@Override
	public void deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(comment);
	}

	@Override
	public void updateComment(Comment comment) {
		this.getHibernateTemplate().update(comment);
	}

	@Override
	public Comment getCommentById(int id) {
		return (Comment) this.getHibernateTemplate().load(Comment.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getComments() {
		return (List<Comment>)this.getHibernateTemplate().find("from comment");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> queryForPage(String hql, int offset, int length) {
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
	public List<Comment> getTopN(int i) {
		// TODO Auto-generated method stub
		// return (List<Comment>)this.getHibernateTemplate().find("from comment c where c.isdisplay = true");
		int n = this.getHibernateTemplate().loadAll(Comment.class).size();
		if(n>i){
			return (List<Comment>)this.getHibernateTemplate().find("from comment").subList(0, i);
		}
		else return (List<Comment>)this.getHibernateTemplate().find("from comment").subList(0, n);
	}

}
