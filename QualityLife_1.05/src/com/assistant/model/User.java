/*
 * 
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
@Entity(name="user")
public class User  implements java.io.Serializable{

	private int id;
	private String name;
	private String password;
	private int age;
	private float height; //mm
	private String job;
	private String sex;  //
	private float weight;//kg
	private int xueya_h;
	private int xueya_l;
	private float xuetang;
	private float xuezhi;
	private int kouwei;
	private int bingshi;
	private int guomin;
	private String imageurl;
	private Set<Dish> dishes = new HashSet<Dish>();//
	private Set<Food> foods = new HashSet<Food>();  //
	private Set<AdviceMenu> advicemenus = new HashSet<AdviceMenu>();
	private Set<Record> records = new HashSet<Record>();
	private Set<Comment> comments = new HashSet<Comment>();
	private Set<DietianAdvice> dietianAdvices = new HashSet<DietianAdvice>();
	private Set<Consult> consults = new HashSet<Consult>();
	private int info_complete;
	

	@Column(length=255)
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public int getAge() {
		return age;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	@Column(length=63)
	public String getJob() {
		return job;
	}
	@Column(length=63)
	public String getPassword() {
		return password;
	}
	@Column(length=63)
	public String getName() {
		return name;
	}
	public float getWeight() {
		return weight;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String username) {
		this.name = username;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getXueya_h() {
		return xueya_h;
	}
	public void setXueya_h(int xueya_h) {
		this.xueya_h = xueya_h;
	}
	public int getXueya_l() {
		return xueya_l;
	}
	public void setXueya_l(int xueya_l) {
		this.xueya_l = xueya_l;
	}
	public float getXuetang() {
		return xuetang;
	}
	public void setXuetang(float xuetang) {
		this.xuetang = xuetang;
	}
	public float getXuezhi() {
		return xuezhi;
	}
	public void setXuezhi(float xuezhi) {
		this.xuezhi = xuezhi;
	}
	public int getKouwei() {
		return kouwei;
	}
	public void setKouwei(int kouwei) {
		this.kouwei = kouwei;
	}
	public int getBingshi() {
		return bingshi;
	}
	public void setBingshi(int bingshi) {
		this.bingshi = bingshi;
	}
	public int getGuomin() {
		return guomin;
	}
	public void setGuomin(int guomin) {
		this.guomin = guomin;
	}
	@Column(length=31)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * 用户与饮食记录为单向关联
	 * Record表中生成userId字段
	 * */
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="user_id") 
	public Set<Record> getRecords() {
		return records;
	}
	public void setRecords(Set<Record> records) {
		this.records = records;
	}
	
	/**
	 * 用户与平论之间为单向关联
	 * 
	 * */
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,mappedBy="user")
	//@JoinColumn(name="user_id")
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
//	public Set<Comment> getmyComments() {
//		return myComments;
//	}
//	public void setmyComments(Set<Comment> myComments) {
//		this.myComments = myComments;
//	}
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="users_dishes",
		joinColumns={@JoinColumn(name="user_id")},
		inverseJoinColumns={@JoinColumn(name="dishes_id")}
		)
	public Set<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="users_foods",
		joinColumns={@JoinColumn(name="user_id")},
		inverseJoinColumns={@JoinColumn(name="food_id")}
		)
	public Set<Food> getFoods() {
		return foods;
	}
	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	public Set<DietianAdvice> getDietianAdvices() {
		return dietianAdvices;
	}
	public void setDietianAdvices(Set<DietianAdvice> dietianAdvices) {
		this.dietianAdvices = dietianAdvices;
	}
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="users_advicemenus",
		joinColumns={@JoinColumn(name="user_id")},
		inverseJoinColumns={@JoinColumn(name="advicemenu_id")}
		)
	public Set<AdviceMenu> getAdvicemenus() {
		return advicemenus;
	}
	public void setAdvicemenus(Set<AdviceMenu> advicemenus) {
		this.advicemenus = advicemenus;
	}
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	public Set<Consult> getConsults() {
		return consults;
	}
	public void setConsults(Set<Consult> consults) {
		this.consults = consults;
	}
	public int getInfo_complete() {
		return info_complete;
	}
	public void setInfo_complete(int info_complete) {
		this.info_complete = info_complete;
	}
	
}
