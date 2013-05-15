package com.assistant.service;

import java.util.List;

import com.assistant.model.Taboo;
import com.assistant.util.PageBean;

public interface ITabooService {

	public abstract void saveTaboo(Taboo taboo);
	public abstract void updateTaboo(Taboo taboo);
	public abstract void deleteTabooById(int id);
	public abstract List<Taboo> getAllTaboos();
	public abstract Taboo getTabooById(int id);
	//public abstract Taboo getTabooByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Taboo getTabooByHql(String hql);
	public abstract List<Taboo> getTaboosByHql(String hql);
}
