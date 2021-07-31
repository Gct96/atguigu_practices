package com.atguigu.virtual;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager manager=new Manager("王海",100,5000,50000);
		manager.work();
		CommonEmployee commonEmployee=new CommonEmployee();
		commonEmployee.work();
	}
}
