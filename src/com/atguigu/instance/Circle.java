package com.atguigu.instance;

public class Circle extends GeometricObject {
	private double radius;
	
	public Circle() {
		super();
		radius=1.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius=radius;
	}
	
	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj instanceof Circle) {
			Circle c=(Circle) obj;
			return this.radius==c.radius;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
