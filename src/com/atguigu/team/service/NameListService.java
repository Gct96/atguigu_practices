package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

/**
 * 
 * @Description 负责将Data中的数据封装到employee[]数组中
 * @author KeyboardHero
 * @date 2021年7月27日上午9:57:47
 * @version
 */
public class NameListService {
	
	private Employee[] employees;
	
	/**
	 * 给employees及数组元素进行初始化
	 */
	public NameListService() {
		employees=new Employee[Data.EMPLOYEES.length];
		
		for(int i=0;i<employees.length;i++) {
			//获取员工的类型
			int type=Integer.parseInt(Data.EMPLOYEES[i][0]);
			
			//获取Employee的4个基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name=Data.EMPLOYEES[i][2];
			int age=Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary=Double.parseDouble(Data.EMPLOYEES[i][4]);
			Equipment equipment;//先声明，再根据情况选择赋值
	        double bonus;
	        int stock;
			switch(type) {
			case Data.EMPLOYEE:
				employees[i]=new Employee(id, name, age, salary);
				break;
			case Data.PROGRAMMER:
				equipment=creatEquipment(i);
				employees[i]=new Programmer(id, name, age, salary,equipment);
				break;
			case Data.DESIGNER:
				equipment=creatEquipment(i);
				bonus=Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i]=new Designer(id,name,age,salary,equipment,bonus);
				break;
			case Data.ARCHITECT:
				equipment=creatEquipment(i);
				bonus=Double.parseDouble(Data.EMPLOYEES[i][5]);
				stock=Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i]=new Architect(id, name, age, salary, equipment, 
						bonus, stock);
				break;	
			}
		}	
	}
	/**
	 * 
	 * @Description 获取指定index上的员工设备
	 * @author KeyboardHero
	 * @data 2021年7月27日上午10:35:05
	 * @param i
	 * @return
	 */
	private Equipment creatEquipment(int index) {
		
		int type=Integer.parseInt(Data.EQUIPMENTS[index][0]);
		switch(type) {
		case Data.PC://21
			return new PC(Data.EQUIPMENTS[index][1],Data.EQUIPMENTS[index][2]);
		case Data.NOTEBOOK://22
			return new NoteBook(Data.EQUIPMENTS[index][1],Double.parseDouble
					(Data.EQUIPMENTS[index][2]));
		case Data.PRINTER://23
			return new Printer(Data.EQUIPMENTS[index][1],Data.EQUIPMENTS
					[index][2]);
		}
		return null;
	}

	/**
	 * 
	 * @Description 获取当前的所有员工，相当于get方法
	 * @author KeyboardHero
	 * @data 2021年7月27日上午11:14:30
	 * @return
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	/**
	 * 
	 * @Description 获取指定ID的员工对象
	 * @author KeyboardHero
	 * @data 2021年7月27日上午11:15:14
	 * @param id
	 * @return
	 * @throws TeamException 
	 */
	public Employee getEmployee(int id) throws TeamException {
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getId()==id)
				return employees[i];
		}
		throw new TeamException("找不到指定的员工");
	}
	
	
	
	
	
	
}
