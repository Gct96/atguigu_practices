package com.atguigu.instance;

public class InstanceTest {
	public static void method(Person e) {
		System.out.println(e.getInfo());
	}
	
	public static void main(String[] args) {
		method(new Graduate());
	}
}


class Person{
	protected String name="person";
	protected int age=50;
	public String getInfo() {
		return "Name:"+name+"\n"+"age:"+age;
	}
}


class Student extends Person{
	protected String school="pku";
	public String getInfo() {
		return "Name:"+name+"\n"+"age:"+age+"\n"+"school:"+school;	
	}
}


class Graduate extends Student{
	public String major="IT";
	public String getInfo() {
		return "Name:"+name+"\n"+"age:"+age+"\n"+"school:"+school+"\n"+"major:"
				+major;	
	}
}
