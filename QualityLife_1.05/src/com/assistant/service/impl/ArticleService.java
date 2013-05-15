package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.ArticleDao;
import com.assistant.model.Article;
import com.assistant.service.IArticleService;
import com.assistant.util.PageBean;

@Component
public class ArticleService implements IArticleService {

	private ArticleDao articleDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	@Resource
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public void saveArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.saveArticle(article);
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.updateArticle(article);
	}

	@Override
	public void deleteArticleById(int id) {
		try {
			articleDao.deleteArticleById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}

	@Override
	public List<Article> getAllArticles() {
		return articleDao.getArticles();
	}

	@Override
	public Article getArticleById(int id) {
		return (Article) articleDao.getObjectById(new Article(), id);// getArticleById(id);
	}

	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from article";
		int count = articleDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Article> list = articleDao.queryForPage("from article", offset,
				length); // 该分页的记录
		// 把分页信息保存到Bean中
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(count);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}

	@Override
	public Article getArticleByHql(String hql) {
		// TODO Auto-generated method stub
		return (Article) articleDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getArticlesByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Article>) articleDao.getObjectsByHql(hql);
	}

	@Override
	public PageBean queryForPage(int pageSize, int page, int type) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String hql = "select count(*) from article";
		int count = articleDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Article> list = articleDao.queryForPage("from article where type="+type+"", offset,
				length); // 该分页的记录
		// 把分页信息保存到Bean中
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(count);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}

/*-------------------------------------------------------------------------*/
	
}
