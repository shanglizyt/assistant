package com.assistant.dao.impl;

import org.junit.Test;

import com.assistant.model.User;

public class ObjectTest {

	@Test
	public void n1(){
		User u = new User();
		System.out.println(u.toString());
	}
	
	@Test
	public void St(){
		String s = "我是一个字符串";
		System.out.println(s.length());
	}
}
