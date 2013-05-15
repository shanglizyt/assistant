
/*@操作数据库，定义对数据库表userinfo的增删改查等方法*/

package com.assistant.dao;

import java.util.List;

import com.assistant.model.User;

public interface IUserDao extends IBaseDao{
	public abstract void saveUser(User user);
	public abstract void updateUser(User user);
	public abstract void deleteUserById(int id);
	public abstract void deleteUser(User user);
	public abstract User getUserById(int id);
	public abstract List<User> getUserByName(String name);
	public abstract List<User> getUsers();
	// public abstract boolean checkUserExistsWithName(String user_name);
	/**/
	public List<User> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
	boolean checkUserExistsWithName(String name);
	
}
