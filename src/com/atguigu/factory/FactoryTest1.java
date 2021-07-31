package com.atguigu.factory;
/**
 * 无工厂设计模式
 * @author KeyboardHero
 *
 */
interface Car{
	void run();
}


class Audi implements Car{
	public void run() {
		System.out.println("开奥迪");
	}
}


class BYD implements Car{
	public void run() {
		System.out.println("开比亚迪");
	}
}


public class FactoryTest1 {
	public static void main(String[] args) {
		Car a=new Audi();//对象的创建和调用混在一起
		Car b=new BYD();
		a.run();
		b.run();
	}
}


