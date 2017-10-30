package impl;

import java.util.List;

import abs.Employer;

public class Client {
	public static void main(String[] args) {
		Employer pm = new ProjectManager("项目经理");
		Employer pa = new ProjectAssistant("项目助理");
		Employer p1 = new Programmer("程序员1");
		Employer p2 = new Programmer("程序员2");
		
		pm.add(pa);
		pm.add(p1);
		List<Employer> list = pm.getEmployers();
		for(Employer em:list){
			System.out.println(em.getName());
		}
	}
}
