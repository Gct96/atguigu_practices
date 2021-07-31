package com.atguigu.account;

public class CheckAccount extends Account {
	private double overdraft;//可透支限额
	
	public CheckAccount(int id, double balance, double annualInterestRate,
			double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft=overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance()>=amount) {
			super.withdraw(amount);
		}
		else if(overdraft>=amount-getBalance()) {//可以透支
			overdraft-=(amount-getBalance());
			setBalance(0);
			System.out.println("成功取出: "+amount);
		}
		else {
			System.out.println("金额:"+(amount-getBalance())+"超过透支限额，取款"
					+ "失败！");
		}
	}
}
