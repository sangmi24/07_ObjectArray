package com.hw3.model.vo;

public class Product {

	//鞘靛何
	private int pld;      //力前锅龋
	private String pName; //力前疙
	private int price;    //力前 啊拜
	private double tax;   //力前 技陛
	
	//积己磊何
	public Product() {
	}

	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	//皋家靛何
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
		return "Product [力前 锅龋: " + pld + ", 力前疙: " + pName + ", 力前 啊拜: " + price + ", 力前 技陛: " + tax + "]";
	}
   
	
	
	
	
	
	
	
}
