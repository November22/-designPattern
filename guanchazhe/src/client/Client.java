package client;

import impl.ConcreteObServer1;
import impl.ConcreteObServer2;
import impl.ConcreteSubject;
import inter.ObServer;
import inter.Subject;

public class Client {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		ObServer ob1 = new ConcreteObServer1(sub);
		ObServer ob2 = new ConcreteObServer2(sub);
//		sub.addObServer(ob1);
//		sub.addObServer(ob2);
		sub.doSomething();
	}
}
