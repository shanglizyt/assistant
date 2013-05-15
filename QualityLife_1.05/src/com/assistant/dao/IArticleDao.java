package com.assistant.dao;

import java.util.List;

import com.assistant.model.Article;

public interface IArticleDao extends IBaseDao{
	public abstract void saveArticle(Article article);
	public abstract void deleteArticleById(int id);
	public abstract void deleteArticle(Article article);
	public abstract void updateArticle(Article article);
	public abstract Article getArticleById(int id);
	// public abstract List<Article> getArticleByName(String name);
	public abstract List<Article> getArticles();
	// public abstract boolean checkArticleExistsWithName(String article_name);
	/**/
	public abstract List<Article> queryForPage(String hql,int offset,int length);
	//总记录条数
	public abstract int getCount(String hql);
}
