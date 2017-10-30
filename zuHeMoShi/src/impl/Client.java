package impl;

import java.util.List;

import abs.Employer;

public class Client {
	public static void main(String[] args) {
		Employer pm = new ProjectManager("��Ŀ����");
		Employer pa = new ProjectAssistant("��Ŀ����");
		Employer p1 = new Programmer("����Ա1");
		Employer p2 = new Programmer("����Ա2");
		
		pm.add(pa);
		pm.add(p1);
		List<Employer> list = pm.getEmployers();
		for(Employer em:list){
			System.out.println(em.getName());
		}
	}
}
