package com.atguigu.virtual2;
/**
 * 继承Employee类，实现按月计算工资的员工处理
 * @author KeyboardHero
 *
 */
public class SalariedEmployee extends Employee{
	private double monthlySalary;
	
	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}

	public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double earnings() {
		return monthlySalary;
	}
	
	public String toString() {
		return "SalariedEmployee["+super.toString()+"]";
	}
		

}
