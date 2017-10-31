package abs;

/**
 * 
 * @author sen.huang
 *
 */
public abstract class Decorator implements Person{
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}



	@Override
	public void chuan(){
		person.chuan();
	}
	
}
