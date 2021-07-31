package com.atguigu.circle2;
/**
 * 继承性练习
 * @author KeyboardHero
 *
 */
public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cy=new Cylinder();
		cy.setRadius(2.1);
		cy.setHeight(3.4);
		System.out.println("底面圆的面积为: "+cy.findArea());
		System.out.println("圆柱的体积为: "+cy.findVolume());
		System.out.println("圆柱的表面积为: "+cy.findArea());
	}
}
