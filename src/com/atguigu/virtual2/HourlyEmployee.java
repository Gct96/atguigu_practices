package com.atguigu.virtual2;
/**
 * 继承Employee类，实现按小时计算工资的员工处理
 * @author KeyboardHero
 *
 */
public class HourlyEmployee extends Employee {
	private double wage;
	private int hour;
	public HourlyEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}

	public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public double earnings() {
		return wage*hour;
	}
	
	public String toString() {
		return "HourlyEmployee["+super.toString()+"]";
	}

}
