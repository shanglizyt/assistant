package com.assistant.util;

import java.util.List;
/** 用于封装DisplayTag当前分页数据的PaginatedList实现类 */
public class PageList {
	private List<?> list;//每页的列表
    private int pageNumber=1;//当前页码
    private int objectsPerPage=15;//每页记录数
    private int fullListSize=0;//总记录数
    
    private String sortCriterion;
    private String searchId;
    
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getObjectsPerPage() {
		return objectsPerPage;
	}
	public void setObjectsPerPage(int objectsPerPage) {
		this.objectsPerPage = objectsPerPage;
	}
	public int getFullListSize() {
		return fullListSize;
	}
	public void setFullListSize(int fullListSize) {
		this.fullListSize = fullListSize;
	}
	public String getSortCriterion() {
		return sortCriterion;
	}
	public void setSortCriterion(String sortCriterion) {
		this.sortCriterion = sortCriterion;
	}
	public String getSearchId() {
		return searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
}
