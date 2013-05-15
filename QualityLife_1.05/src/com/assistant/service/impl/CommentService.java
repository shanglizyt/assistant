package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.CommentDao;
import com.assistant.model.Comment;
import com.assistant.service.ICommentService;
import com.assistant.util.PageBean;

/**
 * @author zyt-pc
 *
 */
@Component
public class CommentService implements ICommentService{
	
	private CommentDao commentDao;
	public CommentDao getCommentDao() {
		return commentDao;
	}

	@Resource
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	@Override
	public void saveComment(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.saveComment(comment);
	}
	
	@Override
	public void updateComment(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.updateComment(comment);
	}
	
	@Override
	public void deleteCommentById(int id) {
		try {
			commentDao.deleteCommentById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<Comment> getAllComments() {
		return commentDao.getComments();
	}

	@Override
	public Comment getCommentById(int id) {
		// return (Comment) commentDao.getObjectById(new Comment(),id);
		return commentDao.getCommentById(id);
	}

//	@Override
//	public Comment getCommentByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from comment";
		int count = commentDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<Comment> list = commentDao.queryForPage("from comment", offset, length); // 该分页的记录
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
	public Comment getCommentByHql(String hql) {
		// TODO Auto-generated method stub
		return (Comment) commentDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getCommentsByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<Comment>) commentDao.getObjectsByHql(hql);
	}

	@Override
	public List<Comment> getTopN(int i) {
		// TODO Auto-generated method stub
		return commentDao.getTopN(i);
	}

}
