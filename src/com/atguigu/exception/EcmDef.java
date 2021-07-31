package com.atguigu.exception;

public class EcmDef {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			
			int result = ecm(i,j);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不一致");
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("分母不能为0");
			e.printStackTrace();
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int ecm(int i,int j) throws EcDef {
		if(i<0||j<0) {
			throw new EcDef("分子或分母为负数了！");
		}
		return i/j;
	}
}
