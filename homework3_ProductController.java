package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	//필드부
	private Product[] pro = new Product[10];
	public static int count = 0;
	static Scanner sc =new Scanner(System.in);
	//product 기본 생성자 및 매개변수 생성자로
	//productController의 객체 수 카운트를 1 증가
	public ProductController() {
		int i=0;
		for(i=0; i<3; i++) {		
			pro[i] = new Product(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
            count=i;
            System.out.println("count ="+count);
		}
	}
	public void mainMenu() {
  
		//메뉴 출력 => do-while 문으로 반복 실행 처리함
	   do {
		   System.out.println("===== 제품 관리 메뉴 =====");
	       System.out.println("1. 제품 정보 추가 ");
	       System.out.println("2. 제품 전체 조회 ");
	       System.out.println("9. 프로그램 종료 ");
	       int select =sc.nextInt();
	       switch(select)
	       {
	       case 1 : productInput();
	           break;
	       case 2 : productPrint();
	           break;
	       case 7 : return;
	       default: System.out.println("잘못된 숫자 입력.");
	       }
	   }while(true);
	   
	}
	//키보드로 도서 정보를 입력 받아 객체 생성
	//Product 생성자 내부에서 ProductController의 count클래스 변수 값이 1씩 증가
	//현재 카운트 인덱스에 생성한 주소 저장
    private void productInput() {
		
    	pro[count+1] = new Product(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
    	ProductController.count++;
	}
    //현재까지 기록된  도서 정보 모두 출력
	private void productPrint() {
		int i=0;
		for(i=0; i<=count; i++) {
			pro[i].toString();
		}
		
	}
	   
	       
	       
	       
	       
	       
	       
	   
		
		
		
		
		
		
		
		
	
	
 
	
	
	
	
}
