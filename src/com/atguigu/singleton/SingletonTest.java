package com.atguigu.singleton;
/**
 * 单例模式的饿汉式实现
 * @author KeyboardHero
 *
 */
public class SingletonTest {
	public static void main(String[] args) {
		Bank bank1=Bank.getInstance();
		Bank bank2=Bank.getInstance();
		System.out.println(bank1==bank2);
	}
}

//饿汉式
class Bank{
	//私有化类的构造器
	private Bank() {
		
	}
    //内部创建类的对象，静态
	private static Bank instance=new Bank();
	//提供公共的静态方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
}