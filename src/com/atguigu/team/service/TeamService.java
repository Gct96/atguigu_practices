package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * 
 * @Description 关于开发团队成员的管理，添加、删除等
 * @author KeyboardHero
 * @date 2021年7月27日下午4:12:35
 * @version
 */
public class TeamService {
	private static int counter=1;//给memberId赋值用
	private final int MAX_MEMBER=5;//限制开发团队的人数
	private Programmer[] team=new Programmer[MAX_MEMBER];//保存开发团队成员
	private int total;//记录开发团队中实际的人数
	
	public TeamService() {
		super();
	}
	/**
	 * 
	 * @Description 获取开发团队中所有的成员
	 * @author KeyboardHero
	 * @data 2021年7月27日下午4:29:38
	 * @return
	 */
	public Programmer[] getTeam() {
		Programmer[] team=new Programmer[total];
		for(int i=0;i<team.length;i++) {
			team[i]=this.team[i];
		}
		return team;
	}
	
	/**
	 * 
	 * @Description 将指定的员工添加到开发团队中
	 * @author KeyboardHero
	 * @data 2021年7月27日下午4:34:01
	 * @param e
	 * @throws TeamException 
	 */
	public void addMember(Employee e) throws TeamException {
		/*
		 * 成员已满无法添加
		 * 员工不是开发人员无法添加
		 * 员工已在本开发团队中
		 * 员工已是某团队成员
		 * 员工正在休假
		 * 团队中只能有一名架构师
		 * 团队中只能有两名设计师
		 * 团队中只能有三名程序员
         *
		 */
		//成员已满无法添加
		if(total>=MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}
		//员工不是开发人员无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该员工不是开发人员，无法添加");
		}
		//员工已在本开发团队中
		if(isExist(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
		//员工已是某团队成员或员工正在休假
		Programmer p=(Programmer)e;//一定不会出现classcastException
		if("BUSY".equals(p.getStatus().getNAME())){
			throw new TeamException("该员工已是某团伙成员");
		}else if("VOCATION".equals(p.getStatus().getNAME())) {
			throw new TeamException("该员工正在休假，无法添加");
		}
		
		//团队中只能有一名架构师、两名设计师、三名程序员
		//先获取团队已有成员中架构师、设计师、程序员的人数
		int numOfArch=0,numOfDes=0,numOfPro=0;
		for(int i=0;i<total;i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
		}	
		//然后判断团队成员配置是否满足要求
		if(p instanceof Architect) {
			if(numOfArch>=1) 
				throw new TeamException("团队中至多只能有一名架构师");
		}else if(p instanceof Designer) {
			if(numOfDes>=2) 
				throw new TeamException("团队中至多只能有两名设计师");
		}else if(p instanceof Programmer) {
			if(numOfPro>=3)
				throw new TeamException("团队中至多只能有三名程序员");
		}
		//到这所有不能添加的情况都已排除
		//将p(e)添加到现有的team中
		team[total++]=p;
		//p的属性赋值
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);	
	}
	
	/**
	 * 
	 * @Description 判断指定的员工是否已经存在于现有的开发团队中
	 * @author KeyboardHero
	 * @data 2021年7月27日下午5:09:44
	 * @param e
	 * @return
	 */
	private boolean isExist(Employee e) {
		
		for(int i=0;i<total;i++) {
			if(team[i].getId()==e.getId())
				return true;
		}
		
		return false; 	
	}
	
	
	/**
	 * 
	 * @Description 从团队中删除成员
	 * @author KeyboardHero
	 * @data 2021年7月27日下午5:50:00
	 * @param memberId
	 * @throws TeamException 
	 */
	public void removeMember(int memberId) throws TeamException {
		int i=0;
		for(;i<total;i++) {
			if(team[i].getMemberId()==memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		
		//未找到指定的memberId的情况
		if(i==total) {
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}
		
		//后一个元素覆盖前一个元素实现删除操作
		for(int j=i+1;j<total;j++) {
			team[j-1]=team[j];
		}
		team[--total]=null;
	}	
}
