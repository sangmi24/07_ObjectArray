package com.hw1.run;

import com.hw1.model.vo.Employee;


public class Run {

	public static void main(String[] args) {
		
    // 객체배열을 크기 3으로 할당 한뒤 
	  Employee[] emp = new Employee[3];
	  
	// 0번 인덱스에는 기본생성자를 통해서 객체 생성
	     emp[0]=new Employee();	 //jvm 이 초기값으로 셋팅	
		System.out.println("emp[0] : "+emp[0].information());
		
    // 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		emp[1]=new Employee();  
		
        emp[1].setEmpNo(1);
        emp[1].setEmpName("홍길동");
        emp[1].setAge(19);
        emp[1].setGender('M');
        emp[1].setPhone("01022223333");
        emp[1].setAddress("서울 잠실");
        System.out.println("emp[1] : "+emp[1].information() );   
	// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력	
        emp[2]=new Employee();
        
        emp[2].setEmpNo(2);
        emp[2].setEmpName("강말순");
        emp[2].setDept("교육부");
        emp[2].setJob("강사");
        emp[2].setAge(20);
        emp[2].setGender('F');
        emp[2].setSalary(1000000);
        emp[2].setBonusPoint(0.01);
        emp[2].setPhone("01011112222");
        emp[2].setAddress("서울 마곡");
        System.out.println("emp[2] : "+emp[2].information() );      
		
        System.out.println("=========================================================================");
        //3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
        emp[0].setEmpNo(0);
        emp[0].setEmpName("김말똥");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setAge(30);
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");
        System.out.println("emp[0] : "+emp[0].information() ); 
        emp[1].setDept("기획부");
        emp[1].setJob("부장");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);
        System.out.println("emp[1] : "+emp[1].information() ); 
        System.out.println("=========================================================================");
        //직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        //보너스가 적용된 연봉=(급여 +(급여*보너스포인트))*12
        System.out.println("김말똥의 연봉 : "+(int)(( emp[0].getSalary()
        		+(emp[0].getSalary()*emp[0].getBonusPoint()))*12)+"원"   ); 
        System.out.println("홍길동의 연봉 : "+(int)(( emp[1].getSalary()
        		+(emp[1].getSalary()*emp[1].getBonusPoint()))*12)+"원"   ); 
        System.out.println("강말순의 연봉 : "+(int)(( emp[2].getSalary()
        		+(emp[2].getSalary()*emp[2].getBonusPoint()))*12)+"원"   ); 
         
        System.out.println("=========================================================================");
        //3명 직원의 연봉 평균을 구하여 출력
        System.out.println("직원들의 연봉의 평균 : "
                +(int)(( (int)(( emp[0].getSalary() +(emp[0].getSalary()*emp[0].getBonusPoint()))*12)
        		+(int)(( emp[1].getSalary() +(emp[1].getSalary()*emp[1].getBonusPoint()))*12) 
        		+(int)(( emp[2].getSalary() +(emp[2].getSalary()*emp[2].getBonusPoint()))*12)) )/3+"원"); 
        
        
        
		
		
		
	}

}
