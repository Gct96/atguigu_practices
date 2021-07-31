package com.atguigu.interfaCe;

public class ComparableCircleTest {
	public static void main(String[] args) {
		
		ComparableCircle c1=new ComparableCircle(3.4);
		ComparableCircle c2=new ComparableCircle(3.6);
		if(c1.compareTo(c2)>0)
			System.out.println("C1大");
		else if(c1.compareTo(c2)<0)
			System.out.println("c2大");
		else
			System.out.println("一样大");
	}
}
