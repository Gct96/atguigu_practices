package com.atguigu.team.domain;
/**
 * 
 * @Description 继承于程序员的设计师类
 * @author KeyboardHero
 * @date 2021年7月26日下午11:11:07
 * @version
 */
public class Designer extends Programmer {
	private double bonus;//奖金

	public Designer() {
		super();
	}

	public Designer(int id, String name, int age, double salary, Equipment 
			equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return getDetails()+"\t设计师\t"+getStatus().getNAME()+"\t"+bonus+"\t\t"+
	getEquipment().getDescription();
	}
	
	public String getDetailsForTeam() {
		return getMemberId()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"
	+getSalary()+"\t设计师\t"+getBonus();
	}
	
}
