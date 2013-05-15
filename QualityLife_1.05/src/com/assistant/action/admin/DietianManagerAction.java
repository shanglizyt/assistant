package com.assistant.action.admin;

import java.io.File;
import java.util.List;
import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.assistant.model.Dietian;
import com.assistant.service.IDietianService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 此类实现对用户的增、删、改、查
 */

@SuppressWarnings("serial")
@Component
public class DietianManagerAction extends ActionSupport {

	private int id;
	private IDietianService dietianService;
	private List<Dietian> dietians;
	private Dietian dietian;

	private File myFile;// 得到头像文件
	private String myFileContentType;// 得到文件的类型
	private String myFileFileName;// 得到文件的名称

	public String list() {
		// this.dietians = this.dietianService.getAllDietians(pageNo, pageSize);
		this.dietians = this.dietianService.getAllDietians();
		return "list";
	}

	public String adddietian() throws Exception {
		if (dietianService.exists(dietian)) {
			addFieldError("dietian exits", "此用户已经存在");
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
			this.dietian.setImageurl(ralativePath);
		}
		dietianService.saveDietian(dietian);
		return "list";
	}

	/** 管理员删除用户信息 */
	public String delete() {
		dietianService.deleteDietianById(id);
		return "list";
	}

	/** 管理员更新用户信息 */
	public String update() throws Exception {
//		Dietian d = dietianService.getDietianById(dietian.getId());
//		System.out.println("update dietian...");
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
			this.dietian.setImageurl(ralativePath);
		}
//		d.setName(dietian.getName());
//		d.setPassword(dietian.getPassword());
//		d.setAge(dietian.getAge());
//		d.setMiaoshu(dietian.getMiaoshu());
		dietianService.updateDietian(dietian);
		return "list";
	}

	public String updateInput() {
		this.dietian = dietianService.getDietianById(id);
		return "input";
	}

	public String loaddietian() {
		this.dietian = dietianService.getDietianById(id);
		return "load";
	}

	public String addinput() {
		return "addinput";
	}

	/*
	 * 以下方法都是geters与seters
	 */

	public List<Dietian> getDietians() {
		return dietians;
	}

	public void setDietians(List<Dietian> dietians) {
		this.dietians = dietians;
	}

	public Dietian getDietian() {
		return dietian;
	}

	public void setDietian(Dietian dietian) {
		this.dietian = dietian;
	}

	public IDietianService getDietianService() {
		return dietianService;
	}

	@Resource
	public void setDietianService(IDietianService dietianService) {
		this.dietianService = dietianService;
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
