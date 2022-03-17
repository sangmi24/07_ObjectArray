package com.hw4.member.controller;

import com.hw4.member.model.vo.Member;

public class MemberController {

   private Member[] m = new Member[SIZE];
   public static final int SIZE = 10; 
   
   //1. ���� �����ϴ� ��� �� ��ȯ 
   public int existMemberNum() {
	   
	   int count=0; //count���� 
	   
	   for(int i=0; i<m.length; i++) {
		   if(m[i]  != null) {
			   count++;
		   }
	   }
	   return count;
   }
   //2. ���̵� �ߺ�Ȯ�� �ϴ� �޼ҵ�
   public Boolean checkId(String inputId) {
	   
	   boolean overlap=false;
	   
	   for(int i=0; i<m.length;i++) { 
		   if(m[i] == null) { //���̵� �ߺ����� �ʾҴ� (����)
			   overlap =false;
			   break;
		   }
		   if(m[i].getId().equals(inputId)) { //���̵�� �Է¾��̵� ���ٸ� 
			overlap = true;
			break;
		}
	   }
	    return overlap;
	   
   }
   //3. Member��ü�� ��ü�迭�� �����ϴ� �޼ҵ�
   public void insertMember(String id, String name,String password,
		                       String email, char gender, int age) {
	   
	   for(int i=0; i<m.length;i++) {
		   if(m[i] == null) { //���ٸ� �����ض� 
			   m[i]=new Member(id,name,password,email,gender,age); 
			   break;
		   }
	   }   
   }
   //4. id�� ȸ���� ��ȸ�ϴ� �޼ҵ�
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
   //5. �̸����� ȸ���� ��ȸ�ϴ� �޼ҵ�
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
   //6. �̸��Ϸ� ȸ���� ��ȸ�ϴ� �޼ҵ�
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
   //7. ��й�ȣ ���� �޼ҵ�
   public Boolean updatePassword(String id, String password) {
	   boolean modifyPass=false;
	   for(int i=0; i<m.length;i++) {
		   if(m[i]==null) {
			   continue;
		   }
	      if(m[i].getId().equals(id)){//���ٸ� �ٲ��ְڴ�.
	    	  m[i].setPassword(password);
	    	  modifyPass=true;
	    	  break;
	      }	    	  
	   } 
	     return modifyPass; 
	   }  
	    
   //8. �̸� ���� �޼ҵ�
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
   //9. �̸��� ���� �޼ҵ�
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
   //10. �� ȸ���� �����ϴ� �޼ҵ�
   public Boolean delete(String id) {
	   boolean delete=false;
	   for(int i=0; i<m.length;i++) {
		   if(m[i]==null) {
			   continue;
		   }
		   if(m[i].getId().equals(id)) {
			   m[i]=null; //���̵� ���ٸ� null������ ����ڴ�. 
			   delete=true;
			   break;
		   }			 
	   }
	   return delete;
	   
   }
   //11. ��ü ȸ���� �����ϴ� �޼ҵ�
   public void delete() {
	   for(int i=0; i<m.length;i++) {
		   m[i]=null;
	   }
   }
   //12. Member ��ü ��ȯ �޼ҵ�
   public Member[] printAll() {
	   Member[] allMember= new Member[SIZE];
	   int count=0;
	   for(int i=0; i<m.length; i++) {
		   if(m[i] != null) { //������ �ִٸ� �����϶�
			   allMember[count] = m[i];
			   count++;
		   }
	   }
	   return allMember;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
