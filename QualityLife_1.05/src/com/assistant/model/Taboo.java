package com.assistant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity(name="taboo")
public class Taboo {

	private int id;
	private String title;
	private String content;
//	private Set<Food> foods = new HashSet<Food>();
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=63)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(length=1023)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
//	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	public Set<Food> getFoods() {
//		return foods;
//	}
//	public void setFoods(Set<Food> foods) {
//		this.foods = foods;
//	}
	
}
