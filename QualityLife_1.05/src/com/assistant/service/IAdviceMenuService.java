package com.assistant.service;

import java.util.List;

import com.assistant.model.AdviceMenu;
import com.assistant.util.PageBean;


public interface IAdviceMenuService {

	public abstract void saveAdviceMenu(AdviceMenu adviceMenu);
	public abstract void updateAdviceMenu(AdviceMenu adviceMenu);
	public abstract void deleteAdviceMenuById(int id);
	public abstract List<AdviceMenu> getAllAdviceMenus();
	public abstract AdviceMenu getAdviceMenuById(int id);
	public abstract AdviceMenu getAdviceMenuByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract AdviceMenu getAdviceMenuByHql(String hql);
	public abstract List<AdviceMenu> getAdviceMenusByHql(String hql);
//	public abstract List<AdviceMenu> getAdviceMenuByKouWei(int n ,int kouwei);
}
