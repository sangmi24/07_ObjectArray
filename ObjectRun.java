package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

//�׳� ��ü�� �̿��� ��
public class ObjectRun {

	public static void main(String[] args) {
		
		/*
		//1. �⺻�����ڸ� ���ؼ� ��ü�� ���� ��, setter�޼ҵ带 �̿��ؼ� �Ź� ���� �� �ʵ忡 ����
		Book bk1 = new Book();    // jvm�� �ʱⰪ���� ����
		bk1.setTitle("�ڹ��� ����");
		bk1.setAuthor("���ڹ�");
	    bk1.setPrice(20000);
	    bk1.setPublisher("�ڹ����ǻ�");
	    
	    //2. �Ű����������ڸ� �̿��Ͽ� ������ ���ÿ� ���ϴ� ������ �ʱ�ȭ�ϱ�
	     Book bk2 = new Book("c����� ����","������",18000,"��������ǻ�");
		
	     System.out.println(bk1.information());
	     System.out.println(bk2.information());
	     
	     //3. ����ڰ� �Է��� ����� ��ü�� ����
	      Scanner sc = new Scanner(System.in);     
	     
	      System.out.print("����: ");
	     String title = sc.nextLine();
	     
	     System.out.print("����: ");
	     String author = sc.nextLine();
	     
	     System.out.print("����: ");
	     int price = sc.nextInt();
	     sc.nextLine();
	     
	     System.out.print("���ǻ��: ");
	     String publisher = sc.nextLine();
	     
	     Book bk3 = new Book(title,author,price,publisher);
	     
	     System.out.println(bk3.information());	   
	     */
	     //�� ���������� å 3���� �ϼ��Ȱ�!
	     
	     /*
	      * �� ���� Book ��ü�� �ʿ��ϴٴ� ���� �Ͽ�
	      * �� Book ��ü�� ���ε��� ����
	      * ��, ����ڿ��� �Է¹��� ����� å�� ������ ä���ֱ�! (3��° Scanner �� �� ���)
	      */
		//Book ��ü�� �����ϱ� ���� �ϴ� ���� �ϰ�  null �� ���Ƿ� ä������
	     Book bk1 = null;  
	     Book bk2 = null;
	     Book bk3 = null;
	     
	     Scanner sc = new Scanner(System.in);
	     
	     //3���� ���� ������ �Է¹޾Ƽ� �� ��ü�� �ʱ�ȭ
	     //�̺κ� �ݺ� �Ǿ�� ��
	     //�Է½ÿ��� ��Ե� �ݺ��� �����ϱ� ��!
	     for(int i = 0; i<3 ; i++) { //i= 0, 1, 2 /3 out��
 
		     System.out.print("����: ");
		     String title = sc.nextLine();
		     
		     System.out.print("����: ");
		     String author = sc.nextLine();
		     
		     System.out.print("����: ");
		     int price = sc.nextInt();
		     sc.nextLine();
		      
		     System.out.print("���ǻ�: ");
		     String publisher = sc.nextLine();
		     
		     //�ļ�
		     if(i==0) {  //1Ʈ°
		    	 bk1 = new Book(title,author,price,publisher); //ù��° å ��ü ����
			     
		     }else if(i==1) { //2Ʈ°
		    	 bk2= new Book(title,author,price,publisher); //�ι�° å ��ü ����
		    	 
		     }else { //3Ʈ°
		    	 bk3= new Book(title,author,price,publisher);//����° å ��ü ����
		     }

	     }
	     // ����Ҷ��� �ݺ��� ��� �Ұ�
	     System.out.println(bk1.information());
	     System.out.println(bk2.information());
	     System.out.println(bk3.information());
	     
	     // ���±����� å�� ������ �߰����ִ� ������ �Ѱ�! (�߰����)
	     
	     // ����ڿ��� �˻��� ���� ������ �Է¹޾Ƽ�
	     // �� ��ü �������� ����� ������ ���Ͽ� ��ġ�ϴ� ������ ������ �˷���(�˻����)=> �ݺ��� ����
	     System.out.print("�˻��� å ���� : ");
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
	      * å�� �����ϴ� ���ҿ��� �����
	      * �ڵ� �ۼ��� ������ �� ���� => �ݺ����� ����� Ȱ�� �Ұ�
	      */
	     
	     
	     
	     
	     
	     
	}
	

}




