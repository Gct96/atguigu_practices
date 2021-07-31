package com.atguigu.interfaCe;

public class StaticProxyTest {
	public static void main(String[] args) {
		Proxy proxy=new Proxy(new RealStar());
		proxy.confer();
		proxy.bookTicket();
		proxy.collectMoney();
		proxy.signContract();
		proxy.sing();
	}
}


interface Star{
	void confer();
	void signContract();
	void bookTicket();
	void sing();
	void collectMoney();
}

//被代理类
class RealStar implements Star{

	@Override
	public void confer() {
		
	}

	@Override
	public void signContract() {
		
	}

	@Override
	public void bookTicket() {
		
	}

	@Override
	public void sing() {
		System.out.println("明星唱歌~~~~~");
	}

	@Override
	public void collectMoney() {
		
	}
	
}

//代理类
class Proxy implements Star{
	private Star real;
	
	public Proxy(Star real) {
		this.real=real;
	}
	@Override
	public void confer() {
		System.out.println("经纪人面谈");
	}

	@Override
	public void signContract() {
		System.out.println("经纪人签合同");
	}

	@Override
	public void bookTicket() {
		System.out.println("经纪人订票");
	}

	@Override
	public void sing() {
		real.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("经纪人收钱");
	}
	
}