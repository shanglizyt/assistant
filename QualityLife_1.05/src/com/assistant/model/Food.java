/*
 * 菜品信息
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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity(name="food")
public class Food  implements java.io.Serializable{
	
	private int id;
	private String name; //食物名称
	private String miaoshu;
//	private float reliang;  //热量
//	private float ca;//钙
//	private float water;//水
//	private float tanshuihhw;//碳水化合物
//	private float zhifang;//脂肪
//	private float danbaiz;//蛋白质
//	private float tanglei;//糖类
//	private float danguc;//胆固醇
//	private float fe;//铁
//	private float p;//磷
//	private float na;//钠
//	private float mg;//镁
//	private float k;//钾
//	private float zn;//锌
//	private float yesuan;//叶酸
//	private float yansuan;//烟酸
//	private float v_a;//维生素a
//	private float v_c;//维生素c
//	private float v_d;//维生素d
//	private float v_e;//维生素e
//	private float v_k;//维生素k
//	private float v_b1;//维生素b1
//	private float v_b6;//维生素b6
//	private float v_b12;//维生素b12
//	private float kafeiy;//咖啡因
//	private float zfs_bao;//饱和脂肪酸
//	private float zfs_duo;//多不饱和脂肪酸
//	private float zfs_dan;//单不饱和脂肪酸
//	private float xianwei;//纤维
	private String imageurl;
	private String imageurl2;
	private String imageurl3;
	private Set<Dish> dishes = new HashSet<Dish>();
//	private Set<Taboo> taboos = new HashSet<Taboo>();
	private Set<Element> elements = new HashSet<Element>();
	
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
	@Column(length=1023)
	public String getMiaoshu() {
		return miaoshu;
	}
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	/**
	 * 长度不可太小
	 * */
	@Column(length=255)
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
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
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	public Set<Element> getElements() {
		return elements;
	}
	public void setElements(Set<Element> elements) {
		this.elements = elements;
	}
	@ManyToMany(mappedBy="foods",cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	public Set<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}
//	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
//	public Set<Taboo> getTaboos() {
//		return taboos;
//	}
//	public void setTaboos(Set<Taboo> taboos) {
//		this.taboos = taboos;
//	}
}
