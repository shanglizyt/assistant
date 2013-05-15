/*@操作数据库，定义对数据库表dishinfo的增删改查等S方法*/

package com.assistant.dao;

import java.util.List;

import com.assistant.model.Dish;

public interface IDishDao extends IBaseDao {
	public abstract void saveDish(Dish dish);
	public abstract void updateDish(Dish dish);
	public abstract void deleteDishById(int id);
	public abstract void deleteDish(Dish dish);
	public abstract Dish getDishById(int id);
	public abstract List<Dish> getDishByName(String name);
	public abstract List<Dish> getDishs();
	public abstract boolean checkDishExistsWithName(String dish_name);
	/**/
	public List<Dish> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
	
}
