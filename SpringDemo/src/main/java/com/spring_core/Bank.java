package com.spring_core;

public class Bank {

	String bname;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String bname) {
		super();
		this.bname = bname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Bank: [bname= " + bname + "]";
	}
	
	
}
