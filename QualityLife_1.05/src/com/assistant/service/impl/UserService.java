package com.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.assistant.dao.impl.UserDao;
import com.assistant.model.User;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;

@Component
public class UserService implements IUserService{

	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
	}
	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}
	
	@Override
	public void deleteUserById(int id) {
		try {
			userDao.deleteUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除出错!");
		}
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getUsers();
	}

	@Override
	public User getUserById(int id) {
		return (User) userDao.getObjectById(new User(),id);
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		List<User> users = userDao.getUserByName(name);
		if(!users.isEmpty()){
			return users.get(0);
		}
		else return null;
	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from user";
		int count = userDao.getCount(hql); // 总记录数
		int totalPage = PageBean.countTotalPage(pageSize, count); // 总页数
		int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
		int length = pageSize; // 每页记录数
		int currentPage = PageBean.countCurrentPage(page);
		List<User> list = userDao.queryForPage("from user", offset, length); // 该分页的记录
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
	public User getUserByHql(String hql) {
		// TODO Auto-generated method stub
		return (User) userDao.getObjectByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsersByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<User>) userDao.getObjectsByHql(hql);
	}

	@Override
	public boolean validateUser(String name, String password) {
		List<User> users = userDao.getUserByName(name);
		if(users!=null && users.size()!=0)
		{
			if(users.get(0).getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean exists(User user) {
		// TODO Auto-generated method stub
		return userDao.checkUserExistsWithName(user.getName());
	}

	@Override
	public boolean checkUserExistWithName(String name) {
		return userDao.checkUserExistsWithName(name);
	}
}
