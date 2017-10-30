package abs;

import java.util.List;

/**
 * Component为组合中的对象声明接口
 * 
 * @author sen.huang
 *
 */
public abstract class Employer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void add(Employer employer);
	
	public abstract void delete(Employer employer);
	
	public List<Employer> employes;
	
	public void printInfo(){
		System.out.println(name);
	}
	
	public List<Employer> getEmployers(){
		return this.employes;
	}
}
