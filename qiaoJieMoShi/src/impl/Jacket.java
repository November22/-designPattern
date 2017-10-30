package impl;

import abs.Clothing;
import abs.Person;

public class Jacket extends Clothing{

	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType()+"´©Âí¼×");
	}
	
}
