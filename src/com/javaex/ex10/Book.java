package com.javaex.ex10;
//A
public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	//B
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
	    this.author = author;
	    this.stateCode = 1; 
	    }
	
	//getter,setter C
	    public int getBookNo() {
	        return bookNo;
	    }

	    public void setBookNo(int bookNo) {
	        this.bookNo = bookNo;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public int getStateCode() {
	        return stateCode;
	    }

	    public void setStateCode(int stateCode) {
	        this.stateCode = stateCode;
	    }

	    
	    
	    //대여, 책 상태 출력 메서드 
	    public void rent() { //D
	        this.stateCode = 0; 
	        System.out.println(this.title + "이(가) 대여 됐습니다.");
	    }
	   
	    public void print() { //E
	        System.out.print("책번호: " + this.bookNo + ", 제목: " + this.title + ", 작가: " + this.author);
	        if (this.stateCode == 1) {
	            System.out.println(", 상태: 재고있음");
	        } else {
	            System.out.println(", 상태: 대여중");
	        }
	    }
	}
    
    
    

