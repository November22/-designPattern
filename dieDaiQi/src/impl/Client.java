package impl;

import abs.Aggregate;
import abs.Iterator;

public class Client {
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("123");
		aggregate.add("213");
		Iterator it = aggregate.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
