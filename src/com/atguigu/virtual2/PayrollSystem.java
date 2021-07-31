package com.atguigu.virtual2;

import java.util.Scanner;

/**
 * 创建Employee变量数组并初始化，该数组存放各类雇员对象的引用
 * @author KeyboardHero
 *
 */
public class PayrollSystem {
	public static void main(String[] args) {
		Employee[] emps=new Employee[2];
		emps[0]=new SalariedEmployee("王海", 1002, new MyDate(1996,2,10),15000);
		emps[1]=new HourlyEmployee("李四", 2001, new MyDate(1985,6,12),100,8);
//		System.out.println(emps[0].toString());
//		System.out.println(emps[1].toString());
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入当前的月份：");
		int month=scanner.nextInt();
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i]);
			double salary=emps[i].earnings();
			System.out.println("月工资为："+salary);
			if(month==emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励100元");
			}
		}
	}
}
