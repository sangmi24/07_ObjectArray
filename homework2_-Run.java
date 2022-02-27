package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		//최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] std= new Student[10];
		
		Scanner sc = new Scanner(System.in);
		int count=0; //학생 수를 나타내는 변수-> 한명 추가 시 1씩 증가시켜준다.
		
		//while(true) 을 사용하여 학생들의 정보를 계속 입력 받고
		//입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
		while(true) {
			System.out.print("학년  : ");
			int grade=sc.nextInt();
			sc.nextLine();
			System.out.print("반 : ");
			int classroom=sc.nextInt();
			sc.nextLine();
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("국어점수: ");
			int kor = sc.nextInt();
			sc.nextLine();
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			sc.nextLine();
			System.out.print("수학점수: ");
			int math = sc.nextInt();
			sc.nextLine();
			
			std[count]=new Student(grade,classroom,name,kor,eng,math); 
			count+=1;
			
			//계속 추가할 것인지 물어보고, 'n'이면 계속 객체 추가
		    //'n'일 경우 더 이상 그만 입력 받도록
			System.out.print("계속 추가 입력하시겠습니까? (y/n): ");
			String answer=sc.nextLine();
			
			if(answer.equals("y")|| answer.equals("Y")) {
			  continue;	
			}else if(answer.equals("n")|| answer.equals("N")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
		// 현재 배열에 담겨있는 학생들의 정보를 모두 출력
		for(int i=0; i<count; i++) {
			System.out.println(std[i].toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
