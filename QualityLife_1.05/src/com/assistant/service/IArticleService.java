package com.assistant.service;

import java.util.List;

import com.assistant.model.Article;
import com.assistant.util.PageBean;

public interface IArticleService {

	public abstract void saveArticle(Article article);
	public abstract void updateArticle(Article article);
	public abstract void deleteArticleById(int id);
	public abstract List<Article> getAllArticles();
	public abstract Article getArticleById(int id);
	public abstract PageBean queryForPage(int pageSize, int currentPage);
	public abstract Article getArticleByHql(String hql);
	public abstract List<Article> getArticlesByHql(String hql);
	public abstract PageBean queryForPage(int i, int page, int j);//commen method
	/*------------------------------------------------------------------------*/
	
}
