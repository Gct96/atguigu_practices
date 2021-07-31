package com.atguigu.factory;
/**
 * 工厂方法模式
 * @author KeyboardHero
 *
 */
interface Car3{
	void run();
}

//两个实现类
class Audi3 implements Car3{
	public void run() {
		System.out.println("开奥迪");
	}
}


class BYD3 implements Car3{
	public void run() {
		System.out.println("开比亚迪");
	}
}

//工厂接口
interface CarFactory3{
	Car3 getCar();
}

//两个工厂类，这两个里面的是对象的创建
class AudiFactory implements CarFactory3{

	@Override
	public Audi3 getCar() {
		return new Audi3();
	}
	
}


class BydFactory implements CarFactory3{

	@Override
	public BYD3 getCar() {
		return new BYD3();
	}
	
}


public class FactoryTest3 {
	public static void main(String[] args) {
		Car3 a3=new AudiFactory().getCar();//这里是对象的调用
		Car3 b3=new BydFactory().getCar();
		a3.run();
		b3.run();
		
	}
}
