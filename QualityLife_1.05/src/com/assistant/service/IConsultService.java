package com.assistant.service;

import java.util.List;

import com.assistant.model.Consult;
import com.assistant.util.PageBean;

public interface IConsultService {

	public abstract void saveConsult(Consult consult);
	public abstract void updateConsult(Consult consult);
	public abstract void deleteConsultById(int id);
	public abstract List<Consult> getAllConsults();
	public abstract Consult getConsultById(int id);
	// public abstract Consult getConsultByName(String name);
	public PageBean queryForPage(int pageSize, int currentPage);
	public abstract Consult getConsultByHql(String hql);
	public abstract List<Consult> getConsultsByHql(String hql);

}
