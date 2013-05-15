package com.assistant.action.admin;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.assistant.model.Dish;
import com.assistant.model.Food;
import com.assistant.service.IDishService;
import com.assistant.service.IFoodService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 此类实现对食物信息的增、删、改、查
 */

@SuppressWarnings("serial")
@Component
public class DishManagerAction extends ActionSupport {

	private int id;
	private int kouwei;
	private IDishService dishService;
	private IFoodService foodService;
	private List<Dish> dishs;
	private Dish dish;

	// 文件上传
	// private File uploadFile;// 得到上传的文件
	private List<File> myFile;
	private List<String> myFileContentType;// 得到文件的类型
	private List<String> myFileFileName;// 得到文件的名称
	
	private List<String> foods;
	
//	private List<String> element;//所含元素的名称集合
//	private List<String> hanliang;//含量集合

	public String list() throws Exception {
		this.dishs = dishService.getAllDishs();
		return "list";
	}

	public String adddish() throws Exception {
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
					this.dish.setImageurl(ralativePath);
					break;
				case 1:
					this.dish.setImageurl2(ralativePath);
					break;
				case 2:
					this.dish.setImageurl3(ralativePath);
					break;
				default:
					this.dish.setImageurl(ralativePath);
				}
			}
		}
		System.out.println(foods.toString());
		if(myFile!=null){
			for(int i=0;i<foods.size()&&!foods.get(i).equals("");i++){
				Food f;
				try{//从数据库按照名字将食材取出
//					System.out.println("try...");
					f = foodService.getFoodByName(foods.get(i));
					if(f.equals(null)) throw new Exception();//不存在，抛出异常
//					System.out.println("try...:"+f.toString());
					dish.getFoods().add(f);
				}catch(Exception e){//数据库不存在这种食材，因此新建该食材并存入数据库。
//					System.out.println("catch...");
					f = new Food();
					f.setName(foods.get(i));
					foodService.saveFood(f);//将此种食材存进数据库
					f = foodService.getFoodByName(foods.get(i));
					System.out.println("temp:"+f.getId());
					dish.getFoods().add(f);
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
//				this.dish.getElements().add(e);
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
		// this.dish.setImageurl(ralativePath);
		dish.setKouwei(kouwei);
		dish.setIsdisplay(false);
		dishService.saveDish(dish);
		return "list";
	}

	public String delete() {
		// Dish f = dishService.getDishById(id);
		// f.setDishes(null);
		// dishService.updateDish(f);
		dishService.deleteDishById(id);
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
					this.dish.setImageurl(ralativePath);
					break;
				case 1:
					this.dish.setImageurl2(ralativePath);
					break;
				case 2:
					this.dish.setImageurl3(ralativePath);
					break;
				default:
					this.dish.setImageurl(ralativePath);
				}
			}
		}
		if(!foods.isEmpty()){
			for(int i=0;i<foods.size();i++){
				Food f;//如果没有这种食物的话就新建一个
				try{
					f = foodService.getFoodByName(foods.get(i));
					dish.getFoods().add(f);
				}catch(Exception e){
					Food temp = new Food();
					temp.setName(foods.get(i));
					foodService.saveFood(temp);//将此种食材存进数据库
					temp = foodService.getFoodByName(foods.get(i));
					dish.getFoods().add(temp);
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
//				this.dish.getElements().add(e);
//			}
//		}
		dishService.updateDish(dish);// saveDish(dish);
		return "list";
	}

	public String updateInput() {
		this.dish = this.dishService.getDishById(id);
		return "input";
	}

	public String load() {
		this.dish = dishService.getDishById(id);
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

	public IDishService getDishService() {
		return dishService;
	}

	@Resource
	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}

	public List<Dish> getDishs() {
		return dishs;
	}

	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
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

	public IFoodService getFoodService() {
		return foodService;
	}

	@Resource
	public void setFoodService(IFoodService foodService) {
		this.foodService = foodService;
	}

	public List<String> getFoods() {
		return foods;
	}

	public void setFoods(List<String> foods) {
		this.foods = foods;
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
