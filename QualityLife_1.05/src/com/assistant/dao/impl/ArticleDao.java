package com.assistant.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.assistant.dao.IArticleDao;
import com.assistant.model.Article;

@Component
public class ArticleDao extends AbstractBaseDao implements IArticleDao{

	@Override
	public void saveArticle(Article article) {
		this.getHibernateTemplate().save(article);
	}

	@Override
	public void deleteArticleById(int id) {
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Article.class, id));
	}

	@Override
	public void deleteArticle(Article article) {
		this.getHibernateTemplate().delete(article);
	}

	@Override
	public void updateArticle(Article article) {
		this.getHibernateTemplate().update(article);
	}

	@Override
	public Article getArticleById(int id) {
		return (Article) this.getHibernateTemplate().load(Article.class, id);
	}
	
	public Article getArticleByLoadId(int id) {
		return (Article) this.getHibernateTemplate().get(Article.class, id);
		/** 
		 * return (Article) this.getHibernateTemplate().load(Article.class, id);
		 * org.hibernate.LazyInitializationException: could not initialize proxy - no Session
		 * */
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getArticles() {
		return (List<Article>)this.getHibernateTemplate().find("from article");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> queryForPage(String hql, int offset, int length) {
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
