package com.assistant.action.admin;

import java.io.File;
import java.util.List;
import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.assistant.model.User;
import com.assistant.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 此类实现对用户的增、删、改、查
 */

@SuppressWarnings("serial")
@Component
public class UserManagerAction extends ActionSupport {

	private int id;
	private IUserService userService;
	private List<User> users;
	private User user;
	
	private File myFile;// 得到头像文件
	private String myFileContentType;// 得到文件的类型
	private String myFileFileName;// 得到文件的名称
	
	
	public String list() {
		//this.users = this.userService.getAllUsers(pageNo, pageSize);
		this.users = this.userService.getAllUsers();
		return "list";
	}
	public String adduser() throws Exception{
		if(userService.exists(user)){
			addFieldError("user exits", "此用户已经存在");
			return ERROR;
		}
		if (myFile!=null) {
			String RealPath = ServletActionContext.getServletContext()
					.getRealPath("/images");
			File file = new File(RealPath);
			if (!file.exists()) {
				file.mkdirs();
			}
			FileUtils.copyFile(myFile, new File(file, myFileFileName));
			String path = RealPath + "/" + myFileFileName;
			ServletActionContext.getRequest().setAttribute("realpath", path);
			String ralativePath = "images/" + myFileFileName;
			this.user.setImageurl(ralativePath);
		}
		userService.saveUser(user);
		return "list";
	}
	/** 管理员删除用户信息*/
	public String delete(){
		userService.deleteUserById(id);
		return "list";
	}
	/** 管理员更新用户信息*/
	public String update() throws Exception{
		if (myFile!=null) {
			String RealPath = ServletActionContext.getServletContext()
					.getRealPath("/images");
			File file = new File(RealPath);
			if (!file.exists()) {
				file.mkdirs();
			}
			FileUtils.copyFile(myFile, new File(file, myFileFileName));
			String path = RealPath + "/" + myFileFileName;
			ServletActionContext.getRequest().setAttribute("realpath", path);
			String ralativePath = "images/" + myFileFileName;
			this.user.setImageurl(ralativePath);
		}
//		User u = userService.getUserById(user.getId());
//		System.out.println("update user...");
//		u.setName(user.getName());
//		u.setPassword(user.getPassword());
//		u.setHeight(user.getHeight());
//		u.setAge(user.getAge());
//		u.setJob(user.getJob());
//		u.setSex(user.getSex());
//		u.setWeight(user.getWeight());
		userService.updateUser(user);
		return "list";
	}
	public String updateInput(){
		this.user = userService.getUserById(id);
		return "input";
	}

	public String loaduser(){
		this.user = userService.getUserById(id);
		return "load";
	}
	
	public String addinput(){
		return "addinput";
	}
	
	/*
	 * 以下方法都是geters与seters
	 */
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}	

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUserService getUserService() {
		return userService;
	}
	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileContentType() {
		return myFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	
}
