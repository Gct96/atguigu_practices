package com.atguigu.team.service;
/**
 * 
 * @Description 表示员工的状态
 * @author KeyboardHero
 * @date 2021年7月26日下午10:55:31
 * @version
 */
public class Status {
	
	private final String NAME;
	private Status(String name) {
		this.NAME=name;
	}
	public static final Status FREE=new Status("FREE");
	public static final Status BUSY=new Status("BUSY");
	public static final Status VOCATION=new Status("VOCATION");
	
	public String getNAME() {
		return NAME;
	}
	
	
	
	
	
	
	
}
