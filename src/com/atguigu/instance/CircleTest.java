package com.atguigu.instance;
/**
 * 重写Circle类的equals()和toString()方法，使其比较半径大小和返回类名、半径大小
 * @author KeyboardHero
 *
 */
public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1=new Circle(2.3);
		Circle c2=new Circle("black",1.0,2.3);
		
		System.out.println("颜色是否相等: "+c1.getColor().equals(c2.getColor()));
		
		System.out.println(c1);
		System.out.println(c2.toString());
		
		System.out.println("半径是否相等: "+c1.equals(c2));
		System.out.println("半径是否相等: "+(c1.getRadius()==c2.getRadius()));
	}
}
