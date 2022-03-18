package com.hw4.member.view;

import java.util.Scanner;
import com.hw4.member.controller.MemberController;

public class MemberMenu {

	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	
	//기본생성자
	public MemberMenu() {
		
	}
		//1. 메인메뉴 출력 메소드
		public void mainMenu() {
			
		while(true) {
			
		// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
		// 최대 등록 가능한 회원 수가 몇 명인지 출력
		// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
		//	몇 명이 등록되어 있는지 출력
		mc.existMemberNum();
		System.out.println("최대 등록 가능한 회원 수는" + mc.SIZE +"명입니다. ");
	    System.out.println("현재 등록된 회원 수는"+ mc.existMemberNum() +"명입니다. ");
	    
	    //현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
	    //현재 등록된 회원 수가 10명이 아닐때
	    if(mc.existMemberNum() != mc.SIZE) {
	    	
	    System.out.println("1. 새 회원 등록 ");
	    }    
	    
	    System.out.println("2. 회원 검색 ");
	    System.out.println("3. 회원 정보 수정 ");	    
	    System.out.println("4. 회원 삭제 ");	    
	    System.out.println("5. 모두 출력 ");	    
	    System.out.println("9. 끝내기 ");
	    
	    System.out.print("메뉴 번호: ");
	    int menu = sc.nextInt();
	    sc.nextLine();
		//두 경우 모두 끝내기를 누르면 "프로그램을 종료합니다" 출력 후 
	    //프로그램 종료하고 메뉴 번호에 없는 번호를 누를시
	    //"잘못 입력하셨습니다. 다시 입력해주세요." 출력 후 메뉴 반복
	        		
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
			System.out.println("프로그램을 종료합니다.");
			return;			
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		}
	
	}

	//2. 회원등록하기 위한 데이터를 사용자에게 입력받는 메소드
	public void insertMember() {
		//회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일,성별,나이를
		//사용자에게 직접 입력 받되 아이디 경우는 기존 회원의 아이디와 중복되지 않도록
		//mc의 checkId()메소드를 통해서 중복 검사를 함
		String id=""; 
		char gender=0;
		
		System.out.println("새 회원을 등록합니다.");
		
		while(true) {
		System.out.print("아이디 : ");
		 id=sc.nextLine();
		if(mc.checkId(id)) {
			System.out.println("중복된 아이디입니다.다시 입력해주세요.");
           continue;		
		}else {
			  break;
		}
		}
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("비밀번호: ");
		String password = sc.nextLine();
		System.out.print("이메일: ");
		String email=sc.nextLine();
		
		while(true) {
		System.out.print("성별(M/F): ");
	     gender=sc.nextLine().toUpperCase().charAt(0);
	    if(gender =='M' || gender=='F') {
	    	  break;
	    }else {
	    	System.out.println("성별을 다시 입력하세요. ");
	    	continue;
	    }
	}
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		//mc의 insertMember메소드의 매개변수로 넘김
		mc.insertMember(id, name, password, email, gender, age);
}	
  		

	//3. 검색 메뉴 출력 메소드
	public void searchMember() {
		
		System.out.println("1.아이디로 검색하기 ");
		System.out.println("2.이름으로 검색하기 ");
		System.out.println("3.이메일로 검색하기 " );
		System.out.println("9.메인으로 돌아가기 ");
		System.out.print("메뉴 번호: ");
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
			System.out.println("메인으로 돌아갑니다.");
			return;
		default: 
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}
	//4. 아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchId() {
		System.out.print("검색할 아이디: ");
		String id=sc.nextLine();
		if(mc.searchId(id).equals(" ")) {
			System.out.println("검색 결과가 없습니다.");		
		}else {	
			 System.out.println("찾으신 회원 조회 결과입니다.");
			 System.out.println(mc.searchId(id));
		 }		
		}		
		

	//5. 이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchName() {
		System.out.print("검색할 이름: ");
		String name=sc.nextLine();
		
		if(mc.searchName(name) == null) {
			System.out.println("검색 결과가 없습니다.");
		}else {		
			for(int i=0; i<mc.SIZE;i++) {
				if(mc.searchName(name)[i] == null) {
					break;
				}
				System.out.println(mc.searchName(name)[i].inform());
			}		
		}
	}
	//6. 이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchEmail() {
		System.out.print("검색할 이메일: ");
		String email=sc.nextLine();
		if(mc.searchEmail(email)==null) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i=0; i<mc.SIZE;i++) {
				if(mc.searchEmail(email)[i] ==null) {
					break;
				}
				System.out.println(mc.searchEmail(email)[i].inform());
			}
		}
		
	}
	//7. 수정 메뉴 출력 메소드
	public void updateMember() {
		
		System.out.println("1.비밀번호 수정하기 ");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.print("메뉴 번호:");
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
			   System.out.println("메인으로 돌아갑니다.");
               return;
		  default:
			   System.out.println("잘못 입력하셨습니다.");
		 }		
		}			
	
	//8. 비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id=sc.nextLine();
		System.out.print("수정할 비밀번호: ");
		String password=sc.nextLine();
		
		mc.updatePassword(id, password);
		
		if(mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	//9. 이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateName() {
		System.out.print("수정할 회원의 아이디: ");
		String id=sc.nextLine();
		System.out.print("수정할 이름: ");
		String name=sc.nextLine();
		
		mc.updateName(id, name);
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다. ");
		}
	}
	//10. 이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디: ");
		String id=sc.nextLine();
		System.out.print("수정할 이메일: ");
		String email=sc.nextLine();
		
		mc.updateEmail(id, email);
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다. ");
		}
	}
	//11. 삭제 메뉴 출력 메소드
	public void deleteMember() {
		System.out.println("1.특정 회원 삭제하기");
		System.out.println("2.모든 회원 삭제하기");
		System.out.println("9.메인을 돌아가기");
		System.out.print("메뉴 번호: ");
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
			  System.out.println("메인으로 돌아갑니다.");
			  return;
		default:
			 System.out.println("잘못 입력하셨습니다.");		
		}
        
        
	}
	//12. 하나의 회원 삭제 결과를 출력하는 메소드
    public void deleteOne() {
    	System.out.print("삭제할 회원의 아이디:");
    	String id=sc.nextLine();
    	System.out.print("정말 삭제하시겠습니까?(y/n): ");
    	char select= sc.nextLine().toUpperCase().charAt(0);
    	if(select=='Y') {
    		if(mc.delete(id)) {
    			System.out.println("성공적으로 삭제하였습니다.");
    		}else {
    			System.out.println("존재하지 않는 아이디입니다.");
    		}
    	}else if(select=='N') {
    	    System.out.println("삭제를 취소했습니다. 메인으로 돌아갑니다.");
    	}else {
    		System.out.println("잘못입력하셨습니다. 메인으로 돌아갑니다.");
    	}
    	
    	
    
    }
    //13. 전체 회원 삭제 결과를 출력하는 메소드
    public void deleteAll() {
    	System.out.print("정말 삭제하시겠습니까?(y/n)");
    	char select= sc.nextLine().toUpperCase().charAt(0);
    	if(select=='y') {
    		mc.delete();
    		System.out.println("성공적으로 삭제하였습니다.");
    	}else if(select=='N'){
    		System.out.println("삭제를 취소했습니다. 메인으로 돌아갑니다.");
    	}else {
    		System.out.println("잘못입력하셨습니다. 메인으로 돌아갑니다.");
    	}
    	
    }
    //14. 전체 회원을 출력하는 메소드
    public void printAll() {
    	System.out.println("---- 전체 출력 ----");
    	if(mc.existMemberNum()==0) {
    		System.out.println("저장 된 회원이 없습니다.");
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
