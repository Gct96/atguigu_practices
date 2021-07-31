package com.atguigu.factory;
/**
 * 简单工厂模式
 * @author KeyboardHero
 *
 */
interface Car2{
	void run();
}


class Audi2 implements Car2{
	public void run() {
		System.out.println("开奥迪");
	}
}


class BYD2 implements Car2{
	public void run() {
		System.out.println("开比亚迪");
	}
}


class CarFactory{ //简单工厂模式下的工厂还是一个具体的类
	public static Car2 getCar(String type) {
		if("奥迪".equals(type)) {
			return new Audi2();
		}
		else if("比亚迪".equals(type)){
			return new BYD2();
		}
		else 
			return null;
	}
}


public class FactoryTest2 {
	public static void main(String[] args) {
		Car2 a2=CarFactory.getCar("奥迪");
		a2.run();
		Car2 b2=CarFactory.getCar("比亚迪");		
		b2.run();
	}
}
