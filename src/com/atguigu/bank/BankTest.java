package com.atguigu.bank;

public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		//添加客户前必须将bank的属性 customer[]初始化，否则报空指针错误
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance=bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户："+bank.getCustomer(0).getFirstName()+"的账户余"
				+ "额为："+ balance);
	}	
}
