package impl;

import abs.Employer;

public class ProjectAssistant extends Employer{

	public ProjectAssistant(String name) {
		setName(name);
		employes = null;//项目助理，没有下属
	}
	
	@Override
	public void add(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employer employer) {
		// TODO Auto-generated method stub
		
	}

}
