package com.atguigu.statIck;

public class AccountTest {
	public static void main(String[] args) {
		Account acct1=new Account();
		Account acct2=new Account("root",2000);
		
		Account.setInterestRate(0.012);
		Account.setMinMoney(100);
		
		System.out.println(acct1);
		System.out.println(acct2);
		
		System.out.println(acct1.getInterestRate());
		System.out.println(acct1.getMinMoney());
	}
}
