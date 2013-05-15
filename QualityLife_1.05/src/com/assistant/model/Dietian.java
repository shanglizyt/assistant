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
import javax.persistence.OneToMany;
@SuppressWarnings("serial")
@Entity(name="dietian")
public class Dietian  implements java.io.Serializable{
	private int id;
	private String name;
	private String password;
	private int age;
	private String miaoshu;
	private String zhicheng;
	private String imageurl;
	private Set<DietianAdvice> dietianAdvices = new HashSet<DietianAdvice>();
	private Set<Consult> consults = new HashSet<Consult>();
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=63)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Column(length=1023)
	public String getMiaoshu() {
		return miaoshu;
	}
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	@Column(length=63)
	public String getZhicheng() {
		return zhicheng;
	}
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="dietian_id")
	public Set<DietianAdvice> getDietianAdvices() {
		return dietianAdvices;
	}
	public void setDietianAdvices(Set<DietianAdvice> dietianAdvices) {
		this.dietianAdvices = dietianAdvices;
	}
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="dietian_id")
	public Set<Consult> getConsults() {
		return consults;
	}
	public void setConsults(Set<Consult> consults) {
		this.consults = consults;
	}
	@Column(length=255)
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	@Column(length=63)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
