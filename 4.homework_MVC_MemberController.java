package com.hw4.member.controller;

import com.hw4.member.model.vo.Member;

public class MemberController {

   private Member[] m = new Member[SIZE];
   public static final int SIZE = 10; 
   
   //1. 현재 존재하는 멤버 수 반환 
   public int existMemberNum() {
	   
	   int count=0; //count세기 
	   
	   for(int i=0; i<m.length; i++) {
		   if(m[i]  != null) {
			   count++;
		   }
	   }
	   return count;
   }
   //2. 아이디 중복확인 하는 메소드
   public Boolean checkId(String inputId) {
	   
	   boolean overlap=false;
	   
	   for(int i=0; i<m.length;i++) { 
		   if(m[i] == null) { //아이디가 중복되지 않았다 (없다)
			   overlap =false;
			   break;
		   }
		   if(m[i].getId().equals(inputId)) { //아이디와 입력아이디가 같다면 
			overlap = true;
			break;
		}
	   }
	    return overlap;
	   
   }
   //3. Member객체를 객체배열에 저장하는 메소드
   public void insertMember(String id, String name,String password,
		                       String email, char gender, int age) {
	   
	   for(int i=0; i<m.length;i++) {
		   if(m[i] == null) { //없다면 저장해라 
			   m[i]=new Member(id,name,password,email,gender,age); 
			   break;
		   }
	   }   
   }
   //4. id로 회원을 조회하는 메소드
   public String searchId(String id) {
	   
	   String str="";
	   for(int i=0; i<m.length; i++) {
		  
		   if(m[i].getId().equals(id)) {
			 str += m[i].getId() + " ";
			 str += m[i].getName()+ " ";
			 str += m[i].getPassword()+" ";
			 str += m[i].getEmail()+ " ";
			 str += m[i].getGender()+" ";
			 str += m[i].getAge()+" ";
			 
			 break;
		   }			   
	   }
	   return str;
	   
	   
   }
   //5. 이름으로 회원을 조회하는 메소드
   public Member[] searchName(String name) {
	   Member[] nameSearch = new Member[SIZE];
	   int count = 0;
	   for(int i=0; i<m.length;i++) {
		   if(m[i]==null) {
			   continue;
		   }
		   else if(m[i].getName().equals(name)) {
			   nameSearch[count] = m[i];
			   count++;
		   }
	   }
	   return nameSearch;

   }
   //6. 이메일로 회원을 조회하는 메소드
   public Member[] searchEmail(String email) {
	   Member[] emailSearch= new Member[SIZE];
	   int count=0;
	   for(int i=0; i<m.length;i++) {
		   if(m[i] == null) {
			   continue;
		   }
		   else if(m[i].getEmail().equals(email)) {
			   emailSearch[count] = m[i];
			   count++;
		   }
	   }
	   return emailSearch;
   }
   //7. 비밀번호 변경 메소드
   public Boolean updatePassword(String id, String password) {
	   boolean modifyPass=false;
	   for(int i=0; i<m.length;i++) {
		   if(m[i]==null) {
			   continue;
		   }
	      if(m[i].getId().equals(id)){//같다면 바꿔주겠다.
	    	  m[i].setPassword(password);
	    	  modifyPass=true;
	    	  break;
	      }	    	  
	   } 
	     return modifyPass; 
	   }  
	    
   //8. 이름 변경 메소드
   public Boolean updateName(String id, String name) {
	   boolean modifyName=false;
	   for(int i=0; i<m.length;i++) {
		  if(m[i]==null) {
			  continue;
		  }		  
		   if(m[i].getId().equals(id)) {
			   m[i].setName(name);
			   modifyName=true;
			   break;
		   }
		}
	    return modifyName;
	   
   }
   //9. 이메일 변경 메소드
   public Boolean updateEmail(String id, String email) {
	   boolean modifyEmail=false;
	   for(int i=0; i<m.length;i++) {
		   if(m[i]==null) {
			   continue;
		   }
		   if(m[i].getId().equals(id)) {
			   m[i].setEmail(email);
			   modifyEmail=true;
		   }
	   }
	   return modifyEmail;
   }
   //10. 한 회원만 삭제하는 메소드
   public Boolean delete(String id) {
	   boolean delete=false;
	   for(int i=0; i<m.length;i++) {
		   if(m[i]==null) {
			   continue;
		   }
		   if(m[i].getId().equals(id)) {
			   m[i]=null; //아이디가 같다면 null값으로 만들겠다. 
			   delete=true;
			   break;
		   }			 
	   }
	   return delete;
	   
   }
   //11. 전체 회원을 삭제하는 메소드
   public void delete() {
	   for(int i=0; i<m.length;i++) {
		   m[i]=null;
	   }
   }
   //12. Member 객체 반환 메소드
   public Member[] printAll() {
	   Member[] allMember= new Member[SIZE];
	   int count=0;
	   for(int i=0; i<m.length; i++) {
		   if(m[i] != null) { //내용이 있다면 실행하라
			   allMember[count] = m[i];
			   count++;
		   }
	   }
	   return allMember;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
