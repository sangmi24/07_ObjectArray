package com.kh.chap02_objectArray.model.vo;

public class Phone {

	//�ʵ��
	//�̸�, �ø���, �귣���, ����
	private String name;
	private String series;
	private String brand;
	private int price;
	
	
	//�����ں�
	//�⺻������
	public Phone() {
		
	}
	//��� �ʵ忡 ���� �Ű������� ������ �ִ� ������
	public Phone(String name, String series, String brand, int price) {
		
		this.name=name;
		this.series=series;
		this.brand=brand;
		this.price=price;
	}
	//�޼ҵ��
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setSeries(String series) {
		this.series=series;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getSeries() {
		return series;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	
	//information
	public String information() {
		return "name: "+name+", series: "+series
				+", brand: "+brand+", price: "+price;
	}
	
	
	
	
	
	
	
}
