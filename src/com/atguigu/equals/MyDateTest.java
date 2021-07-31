package com.atguigu.equals;
/**
 * 创建一个MyDate类，重写equals()方法，分别用==和equals()判断测试类中创建的两个日期
 * 一样的对象是否相同
 * @author KeyboardHero
 *
 */

public class MyDateTest {
	public static void main(String[] args) {
		
		MyDate d1=new MyDate(20,7,2021);
		MyDate d2=new MyDate(20,7,2021);
		
		if(d1==d2)
			System.out.println("d1==d2");
		else
			System.out.println("d1!=d2");
		
		if(d1.equals(d2))
			System.out.println("d1 is equal to d2");
		else
			System.out.println("d1 is not equal to d2");
	}
}


class MyDate{
	
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj instanceof MyDate) {
			MyDate mydate=(MyDate) obj;
			return this.day==mydate.day && this.month==mydate.month
					&& this.year==mydate.year;
		}
		return false;	
	}
}