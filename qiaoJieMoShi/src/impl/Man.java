package impl;

import abs.Clothing;
import abs.Person;

public class Man extends Person{

	public Man() {
		setType("����");
	}
	
	@Override
	public void dress() {
		Clothing c = getClothing();
		c.personDressCloth(this);
		
	}

}
