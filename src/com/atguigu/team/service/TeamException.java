package com.atguigu.team.service;
/**
 * 
 * @Description 自定义异常类
 * @author KeyboardHero
 * @date 2021年7月27日上午11:20:29
 * @version
 */
public class TeamException extends Exception {
	static final long serialVersionUID = -3387514229948L;
	
	public TeamException() {
		super();
	}
	
	public TeamException(String msg) {
		super(msg);
	}
}
