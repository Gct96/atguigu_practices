package com.atguigu.bank;

public class Bank {
	private Customer[] customers;//存放多个客户的数组
	private int numberOfCustomers;//记录客户的个数
	
	public Bank() {
		customers=new Customer[10];
	}
	
	public void addCustomer(String firstName,String lastName) {
		Customer cust=new Customer(firstName, lastName);
		customers[numberOfCustomers++]=cust;
	}
	//获取客户的个数
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	//获取指定位置的客户
	public Customer getCustomer(int index) {
		if(index>=0 && index<numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
	
}
