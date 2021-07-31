package com.atguigu.circle2;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		height=1.0;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double findVolume() {
		return super.findArea()*getHeight();
	}
	
	
	public double findArea() {//返回圆柱的表面积
		return Math.PI*getRadius()*getRadius()*2+2*Math.PI*getRadius()
		*getHeight();
	}
	
	
	

}
