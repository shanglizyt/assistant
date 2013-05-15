
/*操作数据库，定义对数据库表foodinfo的增删改查等S方法*/

package com.assistant.dao;

import java.util.List;

import com.assistant.model.Food;

public interface IFoodDao extends IBaseDao {
	public abstract void saveFood(Food food);
	public abstract void updateFood(Food food);
	public abstract void deleteFoodById(int id);
	public abstract void deleteFood(Food food);
	public abstract Food getFoodById(int id);
	public abstract List<Food> getFoodByName(String name);
	public abstract List<Food> getFoods();
	public abstract boolean checkFoodExistsWithName(String food_name);
	/**/
	public List<Food> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
	
}
