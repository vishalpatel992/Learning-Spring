package com.spring_core;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Bank bank;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, Address address, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.address = address; 
		this.bank = bank;
	}
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
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
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [Id= " + id +" , Name= " + name + " , "+ address + " ," + bank +"]";
	}

	public void init()
	{
		System.out.println("init func called ");
	}
	
	public void destroy()
	{
		System.out.println("Destroy func called ");
	}
	
}
