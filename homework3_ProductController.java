package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	//�ʵ��
	private Product[] pro = new Product[10];
	public static int count = 0;
	static Scanner sc =new Scanner(System.in);
	//product �⺻ ������ �� �Ű����� �����ڷ�
	//productController�� ��ü �� ī��Ʈ�� 1 ����
	public ProductController() {
		int i=0;
		for(i=0; i<3; i++) {		
			pro[i] = new Product(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
            count=i;
            System.out.println("count ="+count);
		}
	}
	public void mainMenu() {
  
		//�޴� ��� => do-while ������ �ݺ� ���� ó����
	   do {
		   System.out.println("===== ��ǰ ���� �޴� =====");
	       System.out.println("1. ��ǰ ���� �߰� ");
	       System.out.println("2. ��ǰ ��ü ��ȸ ");
	       System.out.println("9. ���α׷� ���� ");
	       int select =sc.nextInt();
	       switch(select)
	       {
	       case 1 : productInput();
	           break;
	       case 2 : productPrint();
	           break;
	       case 7 : return;
	       default: System.out.println("�߸��� ���� �Է�.");
	       }
	   }while(true);
	   
	}
	//Ű����� ���� ������ �Է� �޾� ��ü ����
	//Product ������ ���ο��� ProductController�� countŬ���� ���� ���� 1�� ����
	//���� ī��Ʈ �ε����� ������ �ּ� ����
    private void productInput() {
		
    	pro[count+1] = new Product(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
    	ProductController.count++;
	}
    //������� ��ϵ�  ���� ���� ��� ���
	private void productPrint() {
		int i=0;
		for(i=0; i<=count; i++) {
			pro[i].toString();
		}
		
	}
	   
	       
	       
	       
	       
	       
	       
	   
		
		
		
		
		
		
		
		
	
	
 
	
	
	
	
}
