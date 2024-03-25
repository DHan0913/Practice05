package com.javaex.ex01;

// v2, private
public class Member {
	// 필드 선언
	// instance 영역 
	private String name;	
	private String id;		
	private int point;
	
	// Getter Setter
	public String getName() {
		// 메서드 영역
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + "), " + point + "점");
	}
	
	
}

