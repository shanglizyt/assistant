package com.assistant.service;

import java.util.List;

import com.assistant.model.Comment;
import com.assistant.util.PageBean;


public interface ICommentService {

	public abstract void saveComment(Comment comment);
	public abstract void updateComment(Comment comment);
	public abstract void deleteCommentById(int id);
	public abstract List<Comment> getAllComments();
	public abstract Comment getCommentById(int id);
	// public abstract Comment getCommentByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Comment getCommentByHql(String hql);
	public abstract List<Comment> getCommentsByHql(String hql);
	public abstract List<Comment> getTopN(int i);
}
