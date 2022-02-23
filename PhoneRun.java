package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class PhoneRun {

	public static void main(String[] args) {
		
	System.out.println("----- 당산 휴대폰-----");
	
	// 휴대폰 몇개 쌓아두고 팔건지=> 최대 보관할 수 있는 재고의 수: 100개
	Phone[] arr = new Phone[100];
	
	//휴대폰을 만들어서 배열에 담는 한큐에 해결하는 과정을 나타냄
	arr[0] =new Phone("갤럭시s","10","삼성",1200000);
	arr[1] =new Phone("아이폰","11","애플",1300000);
	arr[2] =new Phone("갤럭시노트","10","삼성",1500000);
	arr[3] =new Phone("갤럭시z플립","1","삼성",1500000);
	arr[4] =new Phone("미노트","10","샤오미",550000);
	arr[5] =new Phone("아이폰","8","애플",800000);
	arr[6] =new Phone("아이폰","XR","애플",1000000);
	//우리가 보유한 휴대폰은 7대 /100대 까지 보관 가능
	
	System.out.println("구매 가능한 휴대폰 목록");
	for(int i=0; i<arr.length; i++) {
		
		//휴대폰명이  null이 아닐 경우에만 목록이 조회되도록 조치=> NullPointerException 발생
		//arr[i] 에 들어있는 것이 null일 경우에는 break;을 걸겠다 => 로직 변경!
		if(arr[i] != null) {  
			
		   System.out.println(arr[i].information());				
	      }
		else {
			break;
		}
	 }
	
	   System.out.println("-----------------------------");
	   System.out.print("구매하고 싶은 기기명을 입력하세요: ");
	   Scanner sc = new Scanner(System.in);
	   String searchName = sc.nextLine();
	   
	   System.out.print("시리즈도 입력하세요: ");
	   String searchSeries = sc.nextLine();
	   
	   //카운트용 변수 하나 셋팅
	   int count = 0;
	   
	   //몇번째 방의 휴대폰을 골랐는지 잠시 담아둘 변수
	   int pick = 0;
	   
	   for(int i=0; i<arr.length; i++) {
		   
		   // 이 상황에서 아까처럼 NullPointerException 이 발생 가능함
		   //=> 애초에 비교를 하기 전에  arr[i] 자체가 애초에 null 인지 아닌지 먼저 판별을 하고 비교하면 됨
		   if(arr[i] == null ) { //비교를 애초에 막자
			   continue;
		   }
		   else { 		   
			   //있는 기기명을 입력한 경우 그리고 시리즈도 있는 경우
			   if(arr[i].getName().equals(searchName) && arr[i].getSeries().equals(searchSeries) ) {
				   
				   System.out.println("기기정보");
				   System.out.println(arr[i].information());
				   count++;
				   pick = i;  //pick 방에 휴대폰을 담아두겠다.
				   break;   //100번 다 못 돌림 그래서 break; 함			   
		   }
	    }
	  }
	
	   // 이 시점에서
	   //count 값이 1일 경우: 찾았을때 
	   //count 값이 0일 경우: 못찾았을때 
	   if(count == 0) {
		   System.out.println("현재 찾으시는 물건의 재고가 없어요ㅠㅠ");
	   }else {
		   System.out.print("정말 구매하시겠습니까?(y/n) :");
		   char answer =sc.nextLine().charAt(0);
		   
		   if(answer=='y') {
			   System.out.println("지불할 가격은 "+arr[pick].getPrice()+"원 입니다. ");
			   //배열로부터 현재 그 휴대폰의 정보를 지워주면 됨=> 해당 그 배열 방의 값에 null을 넣어 연결고리를 끊자! 
			   arr[pick] =null;
		   }
		   else {
			   System.out.println("안녕히가세요.");
		   }
	   }
	   
	   
	
	

	}

}
