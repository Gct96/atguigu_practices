package com.atguigu.wrapper;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
	public static void main(String[] args) {
		//实例化Scanner获取学生成绩
		Scanner scan=new Scanner(System.in);
		//创建Vector对象
		Vector v=new Vector();
		//for(;;)给Vector中添加数据
		int maxScore=0;
		for(;;) {
			System.out.println("请输入学生成绩(以负数代表结束)");
			int score = scan.nextInt();
			//输入负数是跳出循环
			if(score<0)
				break;
			if(score>100) {
				System.out.println("输入的数非法，请重新输入");
			    continue;
			}
			//添加操作，自动装箱
			v.addElement(score);
			//获取学生成绩的最大值
			if(maxScore<score) {
				maxScore=score;
			}
		}
		//遍历Vector，得到每个学生的成绩，并与最大成绩比较得到每个学生的等级
		char level;
		for(int i=0;i<v.size();i++) {
			Object obj=v.elementAt(i);
			int score=(Integer)obj;//自动拆箱
			if(maxScore-score<=10) 
				level='A';
			else if(maxScore-score<=20)
				level='B';
			else if(maxScore-score<=30)
				level='C';
			else 
				level='D';
			System.out.println("student-"+i+" score is"+score+",level is"+level)
			;
		}
	}
}
