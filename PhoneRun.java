package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class PhoneRun {

	public static void main(String[] args) {
		
	System.out.println("----- ��� �޴���-----");
	
	// �޴��� � �׾Ƶΰ� �Ȱ���=> �ִ� ������ �� �ִ� ����� ��: 100��
	Phone[] arr = new Phone[100];
	
	//�޴����� ���� �迭�� ��� ��ť�� �ذ��ϴ� ������ ��Ÿ��
	arr[0] =new Phone("������s","10","�Ｚ",1200000);
	arr[1] =new Phone("������","11","����",1300000);
	arr[2] =new Phone("�����ó�Ʈ","10","�Ｚ",1500000);
	arr[3] =new Phone("������z�ø�","1","�Ｚ",1500000);
	arr[4] =new Phone("�̳�Ʈ","10","������",550000);
	arr[5] =new Phone("������","8","����",800000);
	arr[6] =new Phone("������","XR","����",1000000);
	//�츮�� ������ �޴����� 7�� /100�� ���� ���� ����
	
	System.out.println("���� ������ �޴��� ���");
	for(int i=0; i<arr.length; i++) {
		
		//�޴�������  null�� �ƴ� ��쿡�� ����� ��ȸ�ǵ��� ��ġ=> NullPointerException �߻�
		//arr[i] �� ����ִ� ���� null�� ��쿡�� break;�� �ɰڴ� => ���� ����!
		if(arr[i] != null) {  
			
		   System.out.println(arr[i].information());				
	      }
		else {
			break;
		}
	 }
	
	   System.out.println("-----------------------------");
	   System.out.print("�����ϰ� ���� ������ �Է��ϼ���: ");
	   Scanner sc = new Scanner(System.in);
	   String searchName = sc.nextLine();
	   
	   System.out.print("�ø�� �Է��ϼ���: ");
	   String searchSeries = sc.nextLine();
	   
	   //ī��Ʈ�� ���� �ϳ� ����
	   int count = 0;
	   
	   //���° ���� �޴����� ������� ��� ��Ƶ� ����
	   int pick = 0;
	   
	   for(int i=0; i<arr.length; i++) {
		   
		   // �� ��Ȳ���� �Ʊ�ó�� NullPointerException �� �߻� ������
		   //=> ���ʿ� �񱳸� �ϱ� ����  arr[i] ��ü�� ���ʿ� null ���� �ƴ��� ���� �Ǻ��� �ϰ� ���ϸ� ��
		   if(arr[i] == null ) { //�񱳸� ���ʿ� ����
			   continue;
		   }
		   else { 		   
			   //�ִ� ������ �Է��� ��� �׸��� �ø�� �ִ� ���
			   if(arr[i].getName().equals(searchName) && arr[i].getSeries().equals(searchSeries) ) {
				   
				   System.out.println("�������");
				   System.out.println(arr[i].information());
				   count++;
				   pick = i;  //pick �濡 �޴����� ��Ƶΰڴ�.
				   break;   //100�� �� �� ���� �׷��� break; ��			   
		   }
	    }
	  }
	
	   // �� ��������
	   //count ���� 1�� ���: ã������ 
	   //count ���� 0�� ���: ��ã������ 
	   if(count == 0) {
		   System.out.println("���� ã���ô� ������ ��� �����Ф�");
	   }else {
		   System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) :");
		   char answer =sc.nextLine().charAt(0);
		   
		   if(answer=='y') {
			   System.out.println("������ ������ "+arr[pick].getPrice()+"�� �Դϴ�. ");
			   //�迭�κ��� ���� �� �޴����� ������ �����ָ� ��=> �ش� �� �迭 ���� ���� null�� �־� ������� ����! 
			   arr[pick] =null;
		   }
		   else {
			   System.out.println("�ȳ���������.");
		   }
	   }
	   
	   
	
	

	}

}
