package com.hw3.model.vo;

public class Product {

	//�ʵ��
	private int pld;      //��ǰ��ȣ
	private String pName; //��ǰ��
	private int price;    //��ǰ ����
	private double tax;   //��ǰ ����
	
	//�����ں�
	public Product() {
	}

	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	//�޼ҵ��
	public int getPld() {
		return pld;
	}

	public void setPld(int pld) {
		this.pld = pld;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Product [��ǰ ��ȣ: " + pld + ", ��ǰ��: " + pName + ", ��ǰ ����: " + price + ", ��ǰ ����: " + tax + "]";
	}
   
	
	
	
	
	
	
	
}
