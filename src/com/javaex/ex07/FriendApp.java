package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
       
 
        
        //for문 시작
        for (int i = 0; i < friendArray.length; i++) {
            System.out.print("이름: ");
            String name = sc.next();
            System.out.print("핸드폰: ");
            String hp = sc.next();
            System.out.print("학교: ");
            String school = sc.next();
            System.out.println("-------------------------------------");
            //for문 끝
            // Friend 객체 생성 및 배열에 추가
           Friend newFriend = new Friend();
           newFriend.setName(name);
           newFriend.setHp(hp);
           newFriend.setSchool(school);
           friendArray[i] = newFriend;
            
        }
        //친구정보 3명 입력 로직 --> 반복문 사용
            
      
        
        // 친구정보 출력

        	for (int i = 0; i < friendArray.length; i++) {
        	    friendArray[i].showInfo();
        }

        sc.close();
    }

}
