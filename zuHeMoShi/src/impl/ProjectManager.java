package impl;

import java.util.ArrayList;

import abs.Employer;

/**
 * composite�������Ӳ�������Щ��������Ϊ
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
		employes.remove(employer);//����toString�Ƴ��� --���ж�����o.equals(elementData[index])
	}

}
