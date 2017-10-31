package impl;

import abs.Facade;

public class Client {
	public static void main(String[] args) {
		Facade f = new FacadeImpl();
		f.method1();
		f.method2();
	}
}
