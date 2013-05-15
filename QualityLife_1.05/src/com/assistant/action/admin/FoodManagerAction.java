package com.assistant.action.admin;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.assistant.model.Element;
import com.assistant.model.Food;
import com.assistant.service.IFoodService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 此类实现对食物信息的增、删、改、查
 */

@SuppressWarnings("serial")
@Component
public class FoodManagerAction extends ActionSupport {

	private int id;
	private IFoodService foodService;
	private List<Food> foods;
	private Food food;

	// 文件上传
	// private File uploadFile;// 得到上传的文件
	private List<File> myFile;
	private List<String> myFileContentType;// 得到文件的类型
	private List<String> myFileFileName;// 得到文件的名称
	
	private List<String> element;//所含元素的名称集合
	private List<String> hanliang;//含量集合

	public String list() throws Exception {
		this.foods = foodService.getAllFoods();
		return "list";
	}

	public String addfood() throws Exception {
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
						new File(file, myFileFileName.get(i)));
				String path = RealPath + "/" + myFileFileName.get(i);
				ServletActionContext.getRequest()
						.setAttribute("realpath", path);
				String ralativePath = "images/" + myFileFileName.get(i);
				switch (i) {
				case 0:
					this.food.setImageurl(ralativePath);
					break;
				case 1:
					this.food.setImageurl2(ralativePath);
					break;
				case 2:
					this.food.setImageurl3(ralativePath);
					break;
				default:
					this.food.setImageurl(ralativePath);
				}
			}
		}
		if(myFile!=null){
			for(int i=0;i<element.size()&&!element.get(i).equals("");i++){
				Element e = new Element();
				e.setName(element.get(i));
				e.setAmount(Integer.parseInt(hanliang.get(i)));
				if(element.get(i).equals("水")||element.get(i).equals("碳水化合物")){
					e.setUnit("g");
				}
				else{
					e.setUnit("mg");
				}
				e.setStandard("100g");
				this.food.getElements().add(e);
			}
		}
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
		// this.food.setImageurl(ralativePath);

		foodService.saveFood(food);
		return "list";
	}

	public String delete() {
		// Food f = foodService.getFoodById(id);
		// f.setDishes(null);
		// foodService.updateFood(f);
		foodService.deleteFoodById(id);
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
					this.food.setImageurl(ralativePath);
					break;
				case 1:
					this.food.setImageurl2(ralativePath);
					break;
				case 2:
					this.food.setImageurl3(ralativePath);
					break;
				default:
					this.food.setImageurl(ralativePath);
				}
			}
		}
		if(!element.isEmpty()){
			for(int i=0;i<element.size()&&!element.get(i).equals("");i++){
				Element e = new Element();
				e.setName(element.get(i));
				e.setAmount(Integer.parseInt(hanliang.get(i)));
				if(element.get(i).equals("水")||element.get(i).equals("碳水化合物")){
					e.setUnit("g");
				}
				else{
					e.setUnit("mg");
				}
				e.setStandard("100g");
				this.food.getElements().add(e);
			}
		}
		foodService.updateFood(food);// saveFood(food);
		return "list";
	}

	public String updateInput() {
		this.food = this.foodService.getFoodById(id);
		return "input";
	}

	public String loadfood() {
		this.food = foodService.getFoodById(id);
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

	public IFoodService getFoodService() {
		return foodService;
	}

	@Resource
	public void setFoodService(IFoodService foodService) {
		this.foodService = foodService;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
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

	public List<String> getElement() {
		return element;
	}

	public void setElement(List<String> element) {
		this.element = element;
	}

	public List<String> getHanliang() {
		return hanliang;
	}

	public void setHanliang(List<String> hanliang) {
		this.hanliang = hanliang;
	}

}
