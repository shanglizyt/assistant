package com.assistant.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@SuppressWarnings("serial")
@Entity(name = "consult")
public class Consult  implements java.io.Serializable{
	private int id;
	private String date;
	private String question;
	private String reply;
	private User user;
	private Dietian replyer;
	private int isReplied; //是否已回复，0代表未回复
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=31)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@ManyToOne(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Column(length=255)
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Column(length=255)
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	@ManyToOne(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	public Dietian getReplyer() {
		return replyer;
	}
	public void setReplyer(Dietian replyer) {
		this.replyer = replyer;
	}
	public int getIsReplied() {
		return isReplied;
	}
	public void setIsReplied(int isReplied) {
		this.isReplied = isReplied;
	}
}
