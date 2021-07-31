package com.atguigu.instance;

public class GeometricTest {
	
	public static void main(String[] args) {
		Circle c1=new Circle("white",1.0,2.3);	
		Circle c2=new Circle("white",1.0,3.3);	
		displayGeometricObject(c1);
		displayGeometricObject(c2);
		equalsArea(c1, c2);
		MyRectangle r1=new MyRectangle(2.0, 5.0, "black", 1.0);
		MyRectangle r2=new MyRectangle(2.0, 5.0, "red", 2.0);
		displayGeometricObject(r1);
		displayGeometricObject(r2);
		equalsArea(r1, r2);
	}
	
	public static void equalsArea(GeometricObject o1,GeometricObject o2) {
		boolean isequal= (o1.findArea()==o2.findArea());
		System.out.println("面积是否相等？"+isequal);
	}
	
	public static void displayGeometricObject(GeometricObject o) {
		System.out.println("面积为："+o.findArea());
	}
}
