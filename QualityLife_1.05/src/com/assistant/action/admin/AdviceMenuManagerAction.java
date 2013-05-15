package com.assistant.action.admin;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.assistant.model.AdviceMenu;
import com.assistant.model.Dish;
import com.assistant.service.IAdviceMenuService;
import com.assistant.service.IDishService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 此类实现对食物信息的增、删、改、查
 */

@SuppressWarnings("serial")
@Component
public class AdviceMenuManagerAction extends ActionSupport {

	private int id;
	private int kouwei;
	private IAdviceMenuService adviceMenuService;
	private IDishService dishService;
	private List<AdviceMenu> adviceMenus;
	private AdviceMenu adviceMenu;

	// 文件上传
	// private File uploadFile;// 得到上传的文件
	private List<File> myFile;
	private List<String> myFileContentType;// 得到文件的类型
	private List<String> myFileFileName;// 得到文件的名称
	
	private List<String> dishes;
	
//	private List<String> element;//所含元素的名称集合
//	private List<String> hanliang;//含量集合

	public String list() throws Exception {
		this.adviceMenus = adviceMenuService.getAllAdviceMenus();
		return "list";
	}

	public String addadviceMenu() throws Exception {
		// System.out.println("file:"+myFile.toString());
		// System.out.println("filename:"+myFileFileName.get(0)+myFileFileName.get(1)+myFileFileName.get(2));
		if (myFile!=null) {
			String RealPath = ServletActionContext.getServletContext()
					.getRealPath("/images");
			File file = new File(RealPath);
			if (!file.exists()) {
				file.mkdirs();
			}
			for (int i = 0; i < myFile.size(); i++) {
	            FileUtils.copyFile(myFile.get(i),
	            		new File(ServletActionContext.getServletContext()
	    	                    .getRealPath("images")     
	    	                    + "/" + myFileFileName));
				
//				FileUtils.copyFile(myFile.get(i),
//						new File(file, myFileFileName.get(i)));
				String path = RealPath + "/" + myFileFileName.get(i);
				ServletActionContext.getRequest()
						.setAttribute("realpath", path);
				String ralativePath = "images/" + myFileFileName.get(i);
				switch (i) {
				case 0:
					this.adviceMenu.setImageurl(ralativePath);
					break;
				case 1:
					this.adviceMenu.setImageurl2(ralativePath);
					break;
				case 2:
					this.adviceMenu.setImageurl3(ralativePath);
					break;
				default:
					break;
				}
			}
		}
		System.out.println(dishes.toString());
		if(dishes!=null){
			for(int i=0;i<dishes.size()&&!dishes.get(i).equals("");i++){
				Dish f;
				try{//从数据库按照名字将食材取出
//					System.out.println("try...");
					f = dishService.getDishByName(dishes.get(i));
					if(f.equals(null)) throw new Exception();//不存在，抛出异常
//					System.out.println("try...:"+f.toString());
					adviceMenu.getDishes().add(f);
				}catch(Exception e){//数据库不存在这种食材，因此新建该食材并存入数据库。
//					System.out.println("catch...");
					f = new Dish();
					f.setName(dishes.get(i));
					dishService.saveDish(f);//将此种食材存进数据库
					f = dishService.getDishByName(dishes.get(i));
					System.out.println("temp:"+f.getId());
					adviceMenu.getDishes().add(f);
				}
			}
		}
//		if(!element.isEmpty()){
//			for(int i=0;i<element.size()&&!element.get(i).equals("");i++){
//				Element e = new Element();
//				e.setName(element.get(i));
//				e.setAmount(Integer.parseInt(hanliang.get(i)));
//				if(element.get(i).equals("水")||element.get(i).equals("碳水化合物")){
//					e.setUnit("g");
//				}
//				else{
//					e.setUnit("mg");
//				}
//				e.setStandard("100g");
//				this.adviceMenu.getElements().add(e);
//			}
//		}
		// String RealPath =
		// ServletActionContext.getServletContext().getRealPath("/images");
		// File file = new File(RealPath);
		// if(!file.exists()){
		// file.mkdirs();
		// }
		// FileUtils.copyFile(uploadFile, new File(file,uploadFileFileName));
		// String path=RealPath+"/"+uploadFileFileName;
		// ServletActionContext.getRequest().setAttribute("realpath",path);
		// String ralativePath = "images/"+uploadFileFileName;
		// this.adviceMenu.setImageurl(ralativePath);
		adviceMenu.setIsdisplay(false);
		adviceMenuService.saveAdviceMenu(adviceMenu);
		return "list";
	}

	public String delete() {
		// AdviceMenu f = adviceMenuService.getAdviceMenuById(id);
		// f.setAdviceMenues(null);
		// adviceMenuService.updateAdviceMenu(f);
		adviceMenuService.deleteAdviceMenuById(id);
		return "list";
	}

	public String update() throws Exception {
		if (!myFile.isEmpty()) {
			String RealPath = ServletActionContext.getServletContext()
					.getRealPath("/images");
			File file = new File(RealPath);
			if (!file.exists()) {
				file.mkdirs();
			}
			for (int i = 0; i < myFile.size(); i++) {
				FileUtils.copyFile(myFile.get(i),
						new File(file, myFileFileName.get(i)));
				String path = RealPath + "/" + myFileFileName.get(i);
				ServletActionContext.getRequest()
						.setAttribute("realpath", path);
				String ralativePath = "images/" + myFileFileName.get(i);
				switch (i) {
				case 0:
					this.adviceMenu.setImageurl(ralativePath);
					break;
				case 1:
					this.adviceMenu.setImageurl2(ralativePath);
					break;
				case 2:
					this.adviceMenu.setImageurl3(ralativePath);
					break;
				default:
					this.adviceMenu.setImageurl(ralativePath);
				}
			}
		}
		if(!dishes.isEmpty()){
			for(int i=0;i<dishes.size();i++){
				Dish d;//如果没有这种食物的话就新建一个
				try{
					d = dishService.getDishByName(dishes.get(i));
					adviceMenu.getDishes().add(d);
				}catch(Exception e){
					Dish temp = new Dish();
					temp.setName(dishes.get(i));
					dishService.saveDish(temp);//将此种食材存进数据库
					temp = dishService.getDishByName(dishes.get(i));
					adviceMenu.getDishes().add(temp);
				}
			}
		}
//		if(!element.isEmpty()){
//			for(int i=0;i<element.size()&&!element.get(i).equals("");i++){
//				Element e = new Element();
//				e.setName(element.get(i));
//				e.setAmount(Integer.parseInt(hanliang.get(i)));
//				if(element.get(i).equals("水")||element.get(i).equals("碳水化合物")){
//					e.setUnit("g");
//				}
//				else{
//					e.setUnit("mg");
//				}
//				e.setStandard("100g");
//				this.adviceMenu.getElements().add(e);
//			}
//		}
		adviceMenuService.updateAdviceMenu(adviceMenu);// saveAdviceMenu(adviceMenu);
		return "list";
	}

	public String updateInput() {
		this.adviceMenu = this.adviceMenuService.getAdviceMenuById(id);
		return "input";
	}

	public String load() {
		this.adviceMenu = adviceMenuService.getAdviceMenuById(id);
		return "load";
	}

	public String addinput() {
		return "addinput";
	}

	/*
	 * 以下方法都是geters与seters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IAdviceMenuService getAdviceMenuService() {
		return adviceMenuService;
	}

	@Resource
	public void setAdviceMenuService(IAdviceMenuService adviceMenuService) {
		this.adviceMenuService = adviceMenuService;
	}

	public List<AdviceMenu> getAdviceMenus() {
		return adviceMenus;
	}

	public void setAdviceMenus(List<AdviceMenu> adviceMenus) {
		this.adviceMenus = adviceMenus;
	}

	public AdviceMenu getAdviceMenu() {
		return adviceMenu;
	}

	public void setAdviceMenu(AdviceMenu adviceMenu) {
		this.adviceMenu = adviceMenu;
	}

	// public File getUploadFile() {
	// return uploadFile;
	// }
	// public void setUploadFile(File uploadFile) {
	// this.uploadFile = uploadFile;
	// }
	// public String getUploadFileContentType() {
	// return uploadFileContentType;
	// }
	// public void setUploadFileContentType(String uploadFileContentType) {
	// this.uploadFileContentType = uploadFileContentType;
	// }
	// public String getUploadFileFileName() {
	// return uploadFileFileName;
	// }
	// public void setUploadFileFileName(String uploadFileFileName) {
	// this.uploadFileFileName = uploadFileFileName;
	// }

	public List<File> getMyFile() {
		return myFile;
	}

	public List<String> getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(List<String> myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public List<String> getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(List<String> myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public void setMyFile(List<File> myFile) {
		this.myFile = myFile;
	}

	public int getKouwei() {
		return kouwei;
	}

	public void setKouwei(int kouwei) {
		this.kouwei = kouwei;
	}

	public IDishService getDishService() {
		return dishService;
	}

	@Resource
	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}

	public List<String> getDishes() {
		return dishes;
	}

	public void setDishes(List<String> dishes) {
		this.dishes = dishes;
	}

//	public List<String> getElement() {
//		return element;
//	}
//
//	public void setElement(List<String> element) {
//		this.element = element;
//	}
//
//	public List<String> getHanliang() {
//		return hanliang;
//	}
//
//	public void setHanliang(List<String> hanliang) {
//		this.hanliang = hanliang;
//	}

}
