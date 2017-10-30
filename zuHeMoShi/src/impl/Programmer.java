package impl;

import abs.Employer;

public class Programmer extends Employer{

	public Programmer(String name) {
		setName(name);
		employes = null;//程序员，表示没有下属了
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
