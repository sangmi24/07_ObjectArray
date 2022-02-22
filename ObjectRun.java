package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

//그냥 객체를 이용한 것
public class ObjectRun {

	public static void main(String[] args) {
		
		/*
		//1. 기본생성자를 통해서 객체를 생성 후, setter메소드를 이용해서 매번 값을 각 필드에 대입
		Book bk1 = new Book();    // jvm이 초기값으로 셋팅
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김자바");
	    bk1.setPrice(20000);
	    bk1.setPublisher("자바출판사");
	    
	    //2. 매개변수생성자를 이용하여 생성과 동시에 원하는 값으로 초기화하기
	     Book bk2 = new Book("c언어의 정석","나씨씨",18000,"씨언어출판사");
		
	     System.out.println(bk1.information());
	     System.out.println(bk2.information());
	     
	     //3. 사용자가 입력한 값들로 객체를 생성
	      Scanner sc = new Scanner(System.in);     
	     
	      System.out.print("제목: ");
	     String title = sc.nextLine();
	     
	     System.out.print("저자: ");
	     String author = sc.nextLine();
	     
	     System.out.print("가격: ");
	     int price = sc.nextInt();
	     sc.nextLine();
	     
	     System.out.print("출판사명: ");
	     String publisher = sc.nextLine();
	     
	     Book bk3 = new Book(title,author,price,publisher);
	     
	     System.out.println(bk3.information());	   
	     */
	     //이 시점까지가 책 3권이 완성된것!
	     
	     /*
	      * 세 개의 Book 객체가 필요하다는 가정 하에
	      * 각 Book 객체를 따로따로 관리
	      * 단, 사용자에게 입력받은 값들로 책의 정보를 채워넣기! (3번째 Scanner 를 쓴 방법)
	      */
		//Book 객체를 생성하기 전에 일단 선언만 하고  null 로 임의로 채워넣음
	     Book bk1 = null;  
	     Book bk2 = null;
	     Book bk3 = null;
	     
	     Scanner sc = new Scanner(System.in);
	     
	     //3개의 도서 정보를 입력받아서 각 객체에 초기화
	     //이부분 반복 되어야 함
	     //입력시에는 어떻게든 반복이 가능하긴 함!
	     for(int i = 0; i<3 ; i++) { //i= 0, 1, 2 /3 out됨
 
		     System.out.print("제목: ");
		     String title = sc.nextLine();
		     
		     System.out.print("저자: ");
		     String author = sc.nextLine();
		     
		     System.out.print("가격: ");
		     int price = sc.nextInt();
		     sc.nextLine();
		      
		     System.out.print("출판사: ");
		     String publisher = sc.nextLine();
		     
		     //꼼수
		     if(i==0) {  //1트째
		    	 bk1 = new Book(title,author,price,publisher); //첫번째 책 객체 생성
			     
		     }else if(i==1) { //2트째
		    	 bk2= new Book(title,author,price,publisher); //두번째 책 객체 생성
		    	 
		     }else { //3트째
		    	 bk3= new Book(title,author,price,publisher);//세번째 책 객체 생성
		     }

	     }
	     // 출력할때는 반복문 사용 불가
	     System.out.println(bk1.information());
	     System.out.println(bk2.information());
	     System.out.println(bk3.information());
	     
	     // 여태까지는 책의 정보를 추가해주는 행위를 한것! (추가기능)
	     
	     // 사용자에게 검색할 도서 제목을 입력받아서
	     // 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려줌(검색기능)=> 반복문 못씀
	     System.out.print("검색할 책 제목 : ");
	     String searchTitle = sc.nextLine();
	     
	     if(searchTitle.equals(bk1.getTitle())){
	    	 System.out.println(bk1.getPrice());
	     } 
	     if(searchTitle.equals(bk2.getTitle())){
	    	 System.out.println(bk2.getPrice());
	     }
	     if(searchTitle.equals(bk3.getTitle())) {
	    	 System.out.println(bk3.getPrice());
	     }
	     
	     /*
	      * 책을 관리하는 역할에는 충실함
	      * 코드 작성시 제한이 좀 있음 => 반복문을 제대로 활용 불가
	      */
	     
	     
	     
	     
	     
	     
	}
	

}




