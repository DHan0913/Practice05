package com.javaex.ex02;


public class Goods {

	private String name;	// 상품명
	private int price;		// 가격

	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
		
	}

	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격: " + price);
	}
	
	
}

