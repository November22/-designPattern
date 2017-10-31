package impl;

import abs.Decorator;

public class Client {
	public static void main(String[] args) {
		Man man = new Man();
		Decorator a = new ConcreteA();
		Decorator b = new ConcreteB();
		Decorator c = new ConcreteC();
		a.setPerson(man);
		b.setPerson(a);
		c.setPerson(b);
		c.chuan();
	}
}
