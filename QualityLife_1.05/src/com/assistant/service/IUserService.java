
/*@定义管理用户事务的方法*/

package com.assistant.service;

import java.util.List;

import com.assistant.model.User;
import com.assistant.util.PageBean;

public interface IUserService {

	public abstract void saveUser(User user);
	public abstract void updateUser(User user);
	public abstract void deleteUserById(int id);
	public abstract List<User> getAllUsers();
	public abstract User getUserById(int id);
	public abstract User getUserByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract User getUserByHql(String hql);
	public abstract List<User> getUsersByHql(String hql);
	public abstract boolean validateUser(String userName, String password);
	public abstract boolean exists(User user);
	public abstract boolean checkUserExistWithName(String name);

}