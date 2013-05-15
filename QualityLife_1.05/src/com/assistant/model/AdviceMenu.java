/*
 * 推荐菜单
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
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity(name="advicemenu")
public class AdviceMenu  implements java.io.Serializable{

	private int id;
	private String name;
	private String miaoshu;  //菜品描述
	private Set<Dish> dishes = new HashSet<Dish>();
	private Set<Comment> comments = new HashSet<Comment>(); //评论
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
	@Column(length=1023)
	public String getMiaoshu() {
		return miaoshu;
	}
	public void setMiaoshu(String description) {
		this.miaoshu = description;
	}
	
	@OneToMany(fetch=FetchType.LAZY)
	// @JoinColumn(name="adviceMenuId")
	public Set<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}
	
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	// @JoinColumn(name="commentID")
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	@Column(length=63)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=255)
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
	@Column(length=255)
	public String getImageurl2() {
		return imageurl2;
	}
	public void setImageurl2(String imageurl2) {
		this.imageurl2 = imageurl2;
	}
	@Column(length=255)
	public String getImageurl3() {
		return imageurl3;
	}
	public void setImageurl3(String imageurl3) {
		this.imageurl3 = imageurl3;
	}
	public boolean isIsdisplay() {
		return isdisplay;
	}
	public void setIsdisplay(boolean isdisplay) {
		this.isdisplay = isdisplay;
	}
	
}
