package impl;

import abs.Clothing;
import abs.Person;

public class Client {
	public static void main(String[] args) {
		Person man = new Man();
		Person lady = new Lady();
		
		Clothing jacket = new Jacket();
		Clothing trouser = new Trouser();
		
		jacket.personDressCloth(man);
		trouser.personDressCloth(man);
		
		jacket.personDressCloth(lady);
		trouser.personDressCloth(lady);
	}
}
