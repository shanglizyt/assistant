/*
 *菜品
 */

package com.assistant.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity(name = "dish")
public class Dish implements java.io.Serializable {

	private int id;
	private String name; //
	private String miaoshu; //
	private int kouwei;//口味：1：酸 2：甜 3：苦 4：辣
	private Set<Food> foods = new HashSet<Food>();
	private Set<Comment> comments = new HashSet<Comment>(); //
	private String imageurl;
	private String imageurl2;
	private String imageurl3;
	private int votecount;
	private boolean isdisplay;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length = 63)
	public String getName() {
		return name;
	}

	public void setName(String dishesname) {
		this.name = dishesname;
	}

	@Column(columnDefinition = "int default 0")
	public int getKouwei() {
		return kouwei;
	}

	public void setKouwei(int kouwei) {
		this.kouwei = kouwei;
	}

	@Column(length = 1023)
	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String description) {
		this.miaoshu = description;
	}

	/**
	 * 
	 * */
	@ManyToMany//(cascade = {CascadeType.ALL })
	@JoinTable(name = "dish_food", joinColumns = { @JoinColumn(name = "dish_id") }, inverseJoinColumns = { @JoinColumn(name = "food_id") })
	public Set<Food> getFoods() {
		return foods;
	}

	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}

	// 一对多,单向
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@Column(length = 255)
	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public int getVotecount() {
		return votecount;
	}

	public void setVotecount(int votecount) {
		this.votecount = votecount;
	}

	@Column(columnDefinition = "boolean default false")
	public boolean isIsdisplay() {
		return isdisplay;
	}

	public void setIsdisplay(boolean isdisplay) {
		this.isdisplay = isdisplay;
	}
	@Column(length = 255)
	public String getImageurl2() {
		return imageurl2;
	}

	public void setImageurl2(String imageurl2) {
		this.imageurl2 = imageurl2;
	}
	@Column(length = 255)
	public String getImageurl3() {
		return imageurl3;
	}

	public void setImageurl3(String imageurl3) {
		this.imageurl3 = imageurl3;
	}
	
}
