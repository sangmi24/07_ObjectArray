package com.hw2.model.vo;

public class Student {

	//필드부
	private int grade;  //학년
	private int classroom; //반
	private String name;  //이름
	private int kor;  //국어점수
	private int eng;  //영어점수
	private int math; //수학점수
	
	//생성자부
	public Student() {
		
	}

	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//메소드부
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [학년 : " + grade + ", 반 : " + classroom + ", 이름: " + name + 
				", 국어점수 : " + kor + ", 영어점수: " + eng + ", 수학점수: " + math + "]";
	}
   

	
	
	
	
	
	
}
