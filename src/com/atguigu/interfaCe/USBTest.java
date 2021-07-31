package com.atguigu.interfaCe;
/**
 * 接口的使用
 * @author KeyboardHero
 *
 */
public class USBTest {
	public static void main(String[] args) {
		
		Computer com=new Computer();
		Flash flash=new Flash();
		com.transferData(flash);
		com.transferData(new USB() {//匿名子类的匿名对象

			@Override
			public void start() {
				System.out.println("打印机开始工作");
			}

			@Override
			public void stop() {
				System.out.println("打印机结束工作");
			}
			
		});
	}
}

//定义一个电脑类，运用多态实现不同设备的接口传输
class Computer{
	public void transferData(USB usb) {
		usb.start();
		System.out.println("具体传输细节");
		usb.stop();
	}
}

//定义一个usb接口的接口
interface USB{
	void start();
	
	void stop();
}

//定义一个实现USB接口的U盘类
class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开始工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}
	
}

//定义一个实现USB接口的打印机类
class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开始工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}