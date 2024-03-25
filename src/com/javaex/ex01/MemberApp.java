package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member a = new Member();
		
		a.setName("정우성");
		a.setId("jws");
		a.setPoint(50000);
		
		Member b = new Member();
		
		b.setName("유재석");
		b.setId("yjs");
		b.setPoint(30000);
		
		Member c = new Member();
		
		c.setName("이효리");
		c.setId("lhr");
		c.setPoint(40000);
		
		
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}

}
