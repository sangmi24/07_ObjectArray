package com.hw1.run;

import com.hw1.model.vo.Employee;


public class Run {

	public static void main(String[] args) {
		
    // ��ü�迭�� ũ�� 3���� �Ҵ� �ѵ� 
	  Employee[] emp = new Employee[3];
	  
	// 0�� �ε������� �⺻�����ڸ� ���ؼ� ��ü ����
	     emp[0]=new Employee();	 //jvm �� �ʱⰪ���� ����	
		System.out.println("emp[0] : "+emp[0].information());
		
    // 1�� �ε������� �Ű����� 6��¥�� �����ڸ� �̿��Ͽ� ��ü ����
		emp[1]=new Employee();  
		
        emp[1].setEmpNo(1);
        emp[1].setEmpName("ȫ�浿");
        emp[1].setAge(19);
        emp[1].setGender('M');
        emp[1].setPhone("01022223333");
        emp[1].setAddress("���� ���");
        System.out.println("emp[1] : "+emp[1].information() );   
	// 2�� �ε������� �Ű����� 10��¥�� �����ڸ� �̿��Ͽ� ��ü ���� �� ���	
        emp[2]=new Employee();
        
        emp[2].setEmpNo(2);
        emp[2].setEmpName("������");
        emp[2].setDept("������");
        emp[2].setJob("����");
        emp[2].setAge(20);
        emp[2].setGender('F');
        emp[2].setSalary(1000000);
        emp[2].setBonusPoint(0.01);
        emp[2].setPhone("01011112222");
        emp[2].setAddress("���� ����");
        System.out.println("emp[2] : "+emp[2].information() );      
		
        System.out.println("=========================================================================");
        //3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� �ٽ� ���
        emp[0].setEmpNo(0);
        emp[0].setEmpName("�踻��");
        emp[0].setDept("������");
        emp[0].setJob("����");
        emp[0].setAge(30);
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("���� ����");
        System.out.println("emp[0] : "+emp[0].information() ); 
        emp[1].setDept("��ȹ��");
        emp[1].setJob("����");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);
        System.out.println("emp[1] : "+emp[1].information() ); 
        System.out.println("=========================================================================");
        //���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
        //���ʽ��� ����� ����=(�޿� +(�޿�*���ʽ�����Ʈ))*12
        System.out.println("�踻���� ���� : "+(int)(( emp[0].getSalary()
        		+(emp[0].getSalary()*emp[0].getBonusPoint()))*12)+"��"   ); 
        System.out.println("ȫ�浿�� ���� : "+(int)(( emp[1].getSalary()
        		+(emp[1].getSalary()*emp[1].getBonusPoint()))*12)+"��"   ); 
        System.out.println("�������� ���� : "+(int)(( emp[2].getSalary()
        		+(emp[2].getSalary()*emp[2].getBonusPoint()))*12)+"��"   ); 
         
        System.out.println("=========================================================================");
        //3�� ������ ���� ����� ���Ͽ� ���
        System.out.println("�������� ������ ��� : "
                +(int)(( (int)(( emp[0].getSalary() +(emp[0].getSalary()*emp[0].getBonusPoint()))*12)
        		+(int)(( emp[1].getSalary() +(emp[1].getSalary()*emp[1].getBonusPoint()))*12) 
        		+(int)(( emp[2].getSalary() +(emp[2].getSalary()*emp[2].getBonusPoint()))*12)) )/3+"��"); 
        
        
        
		
		
		
	}

}
