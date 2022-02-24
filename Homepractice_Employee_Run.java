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
        
        int[] bonus =new int[3];
        int sum = 0;
        
        for(int i=0; i<bonus.length; i++) {
        	bonus[i]=(int)(( emp[i].getSalary()
            		+(emp[i].getSalary()*emp[i].getBonusPoint()))*12);
        	System.out.println(emp[i].getEmpName()+"의 연봉 :  "+bonus[i]+"원" );
        	sum += bonus[i];		
        }
         
        System.out.println("=========================================================================");
        //3명 직원의 연봉 평균을 구하여 출력
  
        System.out.println("직원들의 연봉의 평균: "+sum/3+"원");			
		
	}

}
