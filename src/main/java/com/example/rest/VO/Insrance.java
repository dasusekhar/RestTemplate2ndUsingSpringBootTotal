package com.example.rest.VO;


public class Insrance {
	
	public Insrance() {
		super();
	}

	public Insrance(int id, String name, String address, double amount, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	private int id;

	private String name;
	private String address;
	
	private double amount;
	
	private String  mobile;
	

}
