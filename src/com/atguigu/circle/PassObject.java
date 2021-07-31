package com.atguigu.circle;

public class PassObject {
	public static void main(String[] args) {
		PassObject test=new PassObject();
		Circle c=new Circle();
		test.printAreas(c, 5);
		System.out.println("now radius is "+c.radius);
	}
	
	
	
	
	public void printAreas(Circle c,int time) {
		System.out.println("Radius\t\tArea");
		for(int i=1;i<=time;i++) {
			c.radius=i;
			double area=c.findArea();
			System.out.println(c.radius+"\t\t"+area);
		}
		c.radius=time+1;
	}
}
