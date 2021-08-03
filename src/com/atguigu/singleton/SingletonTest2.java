package com.atguigu.singleton;
/**
 * 单例模式的懒汉式实现
 * @author KeyboardHero
 *
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		
		Order order1=Order.getInstance();
		Order order2=Order.getInstance();
		System.out.println(order1==order2);
	}
}


class Order{
	
	//私有化类的构造器
	private Order() {
		
	}
	
	//先声明当前类对象，不初始化
	private static Order instance=null;
	
	//声明公共的静态的返回当前类对象的方法
//	public static synchronized Order getInstance() {
//		if(instance==null) 
//			instance=new Order();
//		return instance;
//	}
	public static Order getInstance() {
		//双重检查实现线程安全的单例懒汉式
		if(instance==null) {
			synchronized(Bank.class) {
				if(instance==null)
					instance=new Order();
				return instance;	
			}
		}
		return instance;
	}
}