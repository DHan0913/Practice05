package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;
    private String school;

 
    public Friend(String name, String phone, String school) {
        this.name = name;
        this.hp = phone;
        this.school = school;
    }
    
    // getter/setter 작성
	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	public void setHP(String hp) {
		this.hp = hp;
		
	}
	public String getSchool() {
		return school;
	}
	
	void setSchool(String School) {
		this.school = School;
	}
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
