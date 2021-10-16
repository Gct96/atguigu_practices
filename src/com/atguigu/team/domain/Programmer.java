package com.atguigu.team.domain;

import com.atguigu.team.service.Status;
/**
 * 
 * @Description 继承于员工类的程序员类
 * @author KeyboardHero
 * @date 2021年7月26日下午11:11:52
 * @version
 */
public class Programmer extends Employee {
	
	private int memberId;//开发团队中的id
	private Status status=Status.FREE;
	private Equipment equipment;
	
	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	@Override
	public String toString() {
		return getDetails()+"\t程序员\t"+getStatus()+"\t\t\t"+equipment.
				getDescription();
	}
	
	public String getDetailsForTeam() {
		return memberId+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"
	+getSalary()+"\t程序员";
	}
}
