package com.javaex.ex08;

import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int amount;
        
        Account account = new Account("312-89562-123456");
        
        while(run){ //while 시작
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            
            int menuNo = sc.nextInt();
            
            switch(menuNo){ //switch 시작
            
                case 1:
                    System.out.print("예금액>");
                    amount = sc.nextInt();
                    account.deposit(amount);
                    break;
                
                case 2:
                    System.out.print("출금액>");
                    amount= sc.nextInt();
                    account.withdraw(amount);
                    break;
                    
                case 3:
                    System.out.print("잔고액>");
                    account.showBalance();
                    break;
                
                case 4:
                    System.out.print("프로그램 종료");
                    run = false;
                    break;
                    
                default :
                    System.out.println("다시입력해주세요");
                    break;
                    
            }//switch 끝
            
        }//while 끝
        sc.close();
    }

}
