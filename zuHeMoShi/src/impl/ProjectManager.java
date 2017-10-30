package impl;

import java.util.ArrayList;

import abs.Employer;

/**
 * composite定义有子部件的那些部件的行为
 * @author sen.huang
 *
 */
public class ProjectManager extends Employer{

	public ProjectManager(String name) {
		setName(name);
		employes = new ArrayList<>();
	}
	
	@Override
	public void add(Employer employer) {
		employes.add(employer);
		
	}

	@Override
	public void delete(Employer employer) {
		employes.remove(employer);//根据toString移除的 --》判断条件o.equals(elementData[index])
	}

}
