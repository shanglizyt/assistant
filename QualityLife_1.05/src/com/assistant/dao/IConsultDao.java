package com.assistant.dao;

import java.util.List;

import com.assistant.model.Consult;

public interface IConsultDao extends IBaseDao{
	public abstract void saveConsult(Consult consult);
	public abstract void updateConsult(Consult consult);
	public abstract void deleteConsultById(int id);
	public abstract void deleteConsult(Consult consult);
	public abstract Consult getConsultById(int id);
	// public abstract List<Consult> getConsultByName(String name);
	public abstract List<Consult> getConsults();
	// public abstract boolean checkConsultExistsWithName(String consult_name);
	/**/
	public List<Consult> queryForPage(String hql,int offset,int length);
	//总记录条数
	public int getCount(String hql);
}
