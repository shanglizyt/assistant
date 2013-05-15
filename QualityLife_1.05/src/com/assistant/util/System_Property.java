package com.assistant.util;

public class System_Property {
	
	/**
	 * 体重判断方法
	 * */
	public static int overWeight(float hight, float weight, String sex) {
		float male_ave = hight-100;
		float female_ave = hight-102;
		if(sex.equals("male")){
			if (weight <= male_ave*0.8) {
				//过瘦
				return -2;
			}else if(weight > male_ave*0.8 && weight <= male_ave*0.89){
				//瘦
				return -1;
			}else if(weight > male_ave*0.89 && weight <= male_ave*1.1){
				//标准
				return 0;
			}else if(weight > male_ave*1.1 && weight <= male_ave*1.3){
				//超重
				return 1;
			}else{
				//过胖
				return 2;
			}
		}else{
			if (weight <= female_ave*0.8) {
				//过瘦
				return -2;
			}else if(weight > female_ave*0.8 && weight <= female_ave*0.89){
				//瘦
				return -1;
			}else if(weight > female_ave*0.89 && weight <= female_ave*1.1){
				//标准
				return 0;
			}else if(weight > female_ave*1.1 && weight <= female_ave*1.3){
				//超重
				return 1;
			}else{
				//过胖
				return 2;
			}
		}
	}
	
	
	
	
}
