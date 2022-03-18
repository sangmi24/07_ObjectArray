package com.hw4.member.view;

import java.util.Scanner;
import com.hw4.member.controller.MemberController;

public class MemberMenu {

	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	
	//�⺻������
	public MemberMenu() {
		
	}
		//1. ���θ޴� ��� �޼ҵ�
		public void mainMenu() {
			
		while(true) {
			
		// MemberController(mc)Ŭ���� �ȿ� �ִ� ����ʵ带 �̿��Ͽ�
		// �ִ� ��� ������ ȸ�� ���� �� ������ ���
		// ���� ���� ��ϵ� ȸ�� ���� mc�� existMemberNum()�� ��ȯ ������
		//	�� ���� ��ϵǾ� �ִ��� ���
		mc.existMemberNum();
		System.out.println("�ִ� ��� ������ ȸ�� ����" + mc.SIZE +"���Դϴ�. ");
	    System.out.println("���� ��ϵ� ȸ�� ����"+ mc.existMemberNum() +"���Դϴ�. ");
	    
	    //���� ��ϵ� ȸ�� ���� ���� ���� �޴��� �ٸ��� ���
	    //���� ��ϵ� ȸ�� ���� 10���� �ƴҶ�
	    if(mc.existMemberNum() != mc.SIZE) {
	    	
	    System.out.println("1. �� ȸ�� ��� ");
	    }    
	    
	    System.out.println("2. ȸ�� �˻� ");
	    System.out.println("3. ȸ�� ���� ���� ");	    
	    System.out.println("4. ȸ�� ���� ");	    
	    System.out.println("5. ��� ��� ");	    
	    System.out.println("9. ������ ");
	    
	    System.out.print("�޴� ��ȣ: ");
	    int menu = sc.nextInt();
	    sc.nextLine();
		//�� ��� ��� �����⸦ ������ "���α׷��� �����մϴ�" ��� �� 
	    //���α׷� �����ϰ� �޴� ��ȣ�� ���� ��ȣ�� ������
	    //"�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���." ��� �� �޴� �ݺ�
	        		
	    switch (menu) {
		case 1:
			insertMember();
			break;
		case 2 :
			searchMember();
			break;
		case 3:
			updateMember();
			break;
		case 4:
			deleteMember();
			break;
		case 5:
			printAll();
			break;
		case 9:
			System.out.println("���α׷��� �����մϴ�.");
			return;			
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		
		}
	
	}

	//2. ȸ������ϱ� ���� �����͸� ����ڿ��� �Է¹޴� �޼ҵ�
	public void insertMember() {
		//ȸ�� ��Ͽ� �ʿ��� ���̵�, �̸�, ��й�ȣ, �̸���,����,���̸�
		//����ڿ��� ���� �Է� �޵� ���̵� ���� ���� ȸ���� ���̵�� �ߺ����� �ʵ���
		//mc�� checkId()�޼ҵ带 ���ؼ� �ߺ� �˻縦 ��
		String id=""; 
		char gender=0;
		
		System.out.println("�� ȸ���� ����մϴ�.");
		
		while(true) {
		System.out.print("���̵� : ");
		 id=sc.nextLine();
		if(mc.checkId(id)) {
			System.out.println("�ߺ��� ���̵��Դϴ�.�ٽ� �Է����ּ���.");
           continue;		
		}else {
			  break;
		}
		}
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("��й�ȣ: ");
		String password = sc.nextLine();
		System.out.print("�̸���: ");
		String email=sc.nextLine();
		
		while(true) {
		System.out.print("����(M/F): ");
	     gender=sc.nextLine().toUpperCase().charAt(0);
	    if(gender =='M' || gender=='F') {
	    	  break;
	    }else {
	    	System.out.println("������ �ٽ� �Է��ϼ���. ");
	    	continue;
	    }
	}
		System.out.print("����: ");
		int age = sc.nextInt();
		
		//mc�� insertMember�޼ҵ��� �Ű������� �ѱ�
		mc.insertMember(id, name, password, email, gender, age);
}	
  		

	//3. �˻� �޴� ��� �޼ҵ�
	public void searchMember() {
		
		System.out.println("1.���̵�� �˻��ϱ� ");
		System.out.println("2.�̸����� �˻��ϱ� ");
		System.out.println("3.�̸��Ϸ� �˻��ϱ� " );
		System.out.println("9.�������� ���ư��� ");
		System.out.print("�޴� ��ȣ: ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
            break;		
		case 3:
			searchEmail();
            break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.");
			return;
		default: 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
			
	}
	//4. ���̵� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void searchId() {
		System.out.print("�˻��� ���̵�: ");
		String id=sc.nextLine();
		if(mc.searchId(id).equals(" ")) {
			System.out.println("�˻� ����� �����ϴ�.");		
		}else {	
			 System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			 System.out.println(mc.searchId(id));
		 }		
		}		
		

	//5. �̸� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void searchName() {
		System.out.print("�˻��� �̸�: ");
		String name=sc.nextLine();
		
		if(mc.searchName(name) == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {		
			for(int i=0; i<mc.SIZE;i++) {
				if(mc.searchName(name)[i] == null) {
					break;
				}
				System.out.println(mc.searchName(name)[i].inform());
			}		
		}
	}
	//6. �̸��� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void searchEmail() {
		System.out.print("�˻��� �̸���: ");
		String email=sc.nextLine();
		if(mc.searchEmail(email)==null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			for(int i=0; i<mc.SIZE;i++) {
				if(mc.searchEmail(email)[i] ==null) {
					break;
				}
				System.out.println(mc.searchEmail(email)[i].inform());
			}
		}
		
	}
	//7. ���� �޴� ��� �޼ҵ�
	public void updateMember() {
		
		System.out.println("1.��й�ȣ �����ϱ� ");
		System.out.println("2.�̸� �����ϱ�");
		System.out.println("3.�̸��� �����ϱ�");
		System.out.println("9.�������� ���ư���");
		System.out.print("�޴� ��ȣ:");
		int menu=sc.nextInt();
		sc.nextLine();
			
		switch (menu) {
		   case 1:
			  updatePassword();		
			  break;
		   case 2:
			   updateName();
			   break;
		   case 3:
			   updateEmail();
			   break;
		   case 9:
			   System.out.println("�������� ���ư��ϴ�.");
               return;
		  default:
			   System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		 }		
		}			
	
	//8. ��й�ȣ ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id=sc.nextLine();
		System.out.print("������ ��й�ȣ: ");
		String password=sc.nextLine();
		
		mc.updatePassword(id, password);
		
		if(mc.updatePassword(id, password)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}

	//9. �̸� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void updateName() {
		System.out.print("������ ȸ���� ���̵�: ");
		String id=sc.nextLine();
		System.out.print("������ �̸�: ");
		String name=sc.nextLine();
		
		mc.updateName(id, name);
		if(mc.updateName(id, name)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�. ");
		}
	}
	//10. �̸��� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵�: ");
		String id=sc.nextLine();
		System.out.print("������ �̸���: ");
		String email=sc.nextLine();
		
		mc.updateEmail(id, email);
		if(mc.updateEmail(id, email)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�. ");
		}
	}
	//11. ���� �޴� ��� �޼ҵ�
	public void deleteMember() {
		System.out.println("1.Ư�� ȸ�� �����ϱ�");
		System.out.println("2.��� ȸ�� �����ϱ�");
		System.out.println("9.������ ���ư���");
		System.out.print("�޴� ��ȣ: ");
        int menu=sc.nextInt();
        sc.nextLine();
        
        switch (menu) {
		  case 1:
			deleteOne();
			break;
		  case 2:
			 deleteAll();
			 break;
		  case 9:
			  System.out.println("�������� ���ư��ϴ�.");
			  return;
		default:
			 System.out.println("�߸� �Է��ϼ̽��ϴ�.");		
		}
        
        
	}
	//12. �ϳ��� ȸ�� ���� ����� ����ϴ� �޼ҵ�
    public void deleteOne() {
    	System.out.print("������ ȸ���� ���̵�:");
    	String id=sc.nextLine();
    	System.out.print("���� �����Ͻðڽ��ϱ�?(y/n): ");
    	char select= sc.nextLine().toUpperCase().charAt(0);
    	if(select=='Y') {
    		if(mc.delete(id)) {
    			System.out.println("���������� �����Ͽ����ϴ�.");
    		}else {
    			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
    		}
    	}else if(select=='N') {
    	    System.out.println("������ ����߽��ϴ�. �������� ���ư��ϴ�.");
    	}else {
    		System.out.println("�߸��Է��ϼ̽��ϴ�. �������� ���ư��ϴ�.");
    	}
    	
    	
    
    }
    //13. ��ü ȸ�� ���� ����� ����ϴ� �޼ҵ�
    public void deleteAll() {
    	System.out.print("���� �����Ͻðڽ��ϱ�?(y/n)");
    	char select= sc.nextLine().toUpperCase().charAt(0);
    	if(select=='y') {
    		mc.delete();
    		System.out.println("���������� �����Ͽ����ϴ�.");
    	}else if(select=='N'){
    		System.out.println("������ ����߽��ϴ�. �������� ���ư��ϴ�.");
    	}else {
    		System.out.println("�߸��Է��ϼ̽��ϴ�. �������� ���ư��ϴ�.");
    	}
    	
    }
    //14. ��ü ȸ���� ����ϴ� �޼ҵ�
    public void printAll() {
    	System.out.println("---- ��ü ��� ----");
    	if(mc.existMemberNum()==0) {
    		System.out.println("���� �� ȸ���� �����ϴ�.");
    	}else {
    		for(int i=0; i<mc.SIZE; i++) {
    			if(mc.printAll()[i]==null) {
    				break;
    			}else {
    				System.out.println(mc.printAll()[i].inform()+"\n");
    			}
    		}
    	}
    	
    	
    	
    }
	
	
  
	
}
