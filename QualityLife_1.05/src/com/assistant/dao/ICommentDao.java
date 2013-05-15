/*
 * @操作数据库，定义对数据库表Comment的增删改查等方法
 * 
 * */

package com.assistant.dao;

import java.util.List;

import com.assistant.model.Comment;

public interface ICommentDao extends IBaseDao{
	public abstract void saveComment(Comment comment);
	public abstract void updateComment(Comment comment);
	public abstract void deleteCommentById(int id);
	public abstract void deleteComment(Comment comment);
	public abstract Comment getCommentById(int id);
	// public abstract List<Comment> getCommentByName(String name);
	public abstract List<Comment> getComments();
	// public abstract boolean checkCommentExistsWithName(String comment_name);
	/**/
	public List<Comment> queryForPage(String hql,int offset,int length);
	//总记录条数
	//public int getCount(String hql);
	
}