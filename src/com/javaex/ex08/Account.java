package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String acountNo) {
		//	객체 초기화를 담당
		this.accountNo = accountNo;
		System.out.println("계좌를 개설되었습니다.");
        this.balance = 0; 
	}
    
 // 예금 메소드
    public void deposit(int money) {
        balance += money; // 예금액을 현재 잔고에 합산
        System.out.println(money + "원을 예금했습니다.");
    }
 // 출금 메소드
    public void withdraw(int money) {
        if (balance >= money) {
            balance -= money; // 출금액을 현재 잔고에서 차감
            System.out.println(money + "원을 출금했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    
    // 잔고 조회 메소드
    public void showBalance() {
        System.out.println("현재 잔액은 " + balance + "원 입니다.");
    }

    //필요한 메소드 작성

}
