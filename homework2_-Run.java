package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		//�ִ� 10���� �л� ������ ����� �� �ְ� �迭�� �Ҵ��Ѵ�.
		Student[] std= new Student[10];
		
		Scanner sc = new Scanner(System.in);
		int count=0; //�л� ���� ��Ÿ���� ����-> �Ѹ� �߰� �� 1�� ���������ش�.
		
		//while(true) �� ����Ͽ� �л����� ������ ��� �Է� �ް�
		//�Է� ���� �������� ������ �迭�� count �ε����� �Ű����� �����ڸ� ���� ��ü ����
		while(true) {
			System.out.print("�г�  : ");
			int grade=sc.nextInt();
			sc.nextLine();
			System.out.print("�� : ");
			int classroom=sc.nextInt();
			sc.nextLine();
			System.out.print("�̸�: ");
			String name=sc.nextLine();
			System.out.print("��������: ");
			int kor = sc.nextInt();
			sc.nextLine();
			System.out.print("��������: ");
			int eng = sc.nextInt();
			sc.nextLine();
			System.out.print("��������: ");
			int math = sc.nextInt();
			sc.nextLine();
			
			std[count]=new Student(grade,classroom,name,kor,eng,math); 
			count+=1;
			
			//��� �߰��� ������ �����, 'n'�̸� ��� ��ü �߰�
		    //'n'�� ��� �� �̻� �׸� �Է� �޵���
			System.out.print("��� �߰� �Է��Ͻðڽ��ϱ�? (y/n): ");
			String answer=sc.nextLine();
			
			if(answer.equals("y")|| answer.equals("Y")) {
			  continue;	
			}else if(answer.equals("n")|| answer.equals("N")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
		}
		// ���� �迭�� ����ִ� �л����� ������ ��� ���
		for(int i=0; i<count; i++) {
			System.out.println(std[i].toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
