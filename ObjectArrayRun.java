package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

//��ü�迭�� �̿��� ����
public class ObjectArrayRun {

	public static void main(String[] args) {
	
		// �迭�� �� �غ� => �����ϰ�, �Ҵ���� ��ģ ����
		// ���� �� �Ҵ�
		// �ڷ��� [] �迭�� = new �ڷ���[ũ��];
		//���� ���� Ŭ������ ���� => �ڷ����� 
		Book[] books = new Book[3];  //[0]: null, [1]: null, [2]: null
                                     //objectRun���� Book bk1 = null; �� ����. 
	     Scanner sc = new Scanner(System.in);  
		
	     //3���� ��ü ���� ������ �Է¹��� �Ŀ� �� �ε����� �ش� ��ü�� �����ؼ� ��ڴ�.
	     for(int i= 0 ; i< books.length ; i++) {
	    	 
	    	 System.out.print("����: ");
	    	 String title = sc.nextLine();
	    	 
	    	 System.out.print("����: ");
	    	 String author = sc.nextLine();
	    	 
	    	 System.out.print("����: ");
	    	 int price= sc.nextInt();
	    	 sc.nextLine();
	    	 
	    	 System.out.print("���ǻ�: ");
	    	 String publisher = sc.nextLine();
	    	 
	    	 books[i]= new Book(title, author,price,publisher); 
	     }
		 // å �߰� ����� �Ϸ�� ���� 
	     
	     // ���
	     for(int i =0; i<books.length; i++) {
	    	 
	    	 System.out.println(books[i].information());  //books[i]�� �ּҰ���
	     }
	     
	     //��ü å ��ȸ ����� �Ϸ�� ����
	     
	     //�˻�
	     System.out.print("å ����: ");
	     String searchTitle = sc.nextLine();
	     
	     //���� ���� �Ҽ� ������ ĸ��ȭ�� �����ϱ� get��¼��
	     for(int i =0; i<books.length; i++) {
		 
	    	 if(searchTitle.equals(books[i].getTitle())) {
	    		 System.out.println(books[i].getPrice());
	    	 }
	     } 
	     //�˻� ����� �Ϸ�� ����
	     
	}
	
	
	 

}
