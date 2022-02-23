package com.hw1.model.vo;

public class Employee {

	//필드부
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	//생성자부
	//기본자
	public Employee() {
		
	}
	//완료형
	public Employee(int empNo,String empName,String dept,String job,
			        int age,char gender,int salary,double bonusPoint,
			         String phone,String address) {	
	}	
	//메소드부
	//setter
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint=bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setAddress(String address) {
		this.address=address;
	}	
	//getter
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	//information
	public String information() {
		
	return empNo+", "+empName+", "+dept+", "+job+", "+age+", "
			+gender+", "+salary+", "+bonusPoint+", "+phone+", "+ address;
		
	}
	
}
