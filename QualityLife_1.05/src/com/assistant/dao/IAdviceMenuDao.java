/*
 * @操作数据库，定义对数据库表advicemenu的增删改查等方法
 */

package com.assistant.dao;

import java.util.List;

import com.assistant.model.AdviceMenu;

//import java.util.List;
//import com.assistant.model.AdviceMenu;

public interface IAdviceMenuDao extends IBaseDao{
	
	// 保存或增加一个营养套餐
	public abstract void saveAdviceMenu(AdviceMenu adviceMenu);
	// 删除套餐
	public abstract void deleteAdviceMenuById(int id);
	// 以一个对象删除营养套餐
	public abstract void deleteAdviceMenu(AdviceMenu adviceMenu);
	// 更新套餐信息
	public abstract void updateAdviceMenu(AdviceMenu adviceMenu);
	// 以id获得某个营养套餐
	public abstract AdviceMenu getAdviceMenuById(int id);
	/*根据名字获得营养套餐*/
	public abstract List<AdviceMenu> getAdviceMenuByName(String name);
	/*获得数据库表里的所有营养套餐*/
	public abstract List<AdviceMenu> getAdviceMenus();
	/*使用名字来判断营养套餐是否已经存在*/
	public abstract boolean checkAdviceMenuExistsWithName(String menu_name);
	/**/
	
	public abstract List<AdviceMenu> queryForPage(String hql,int offset,int length);
	//总记录条数
	public abstract int getCount(String hql);
	
	//	public abstract AdviceMenu getAdviceMenuByHql(String hql);
	//	
	//	public abstract List<AdviceMenu> getAdviceMenusByHql(String hql);
}
