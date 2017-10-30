package impl;

import abs.Target;

public class Client {
	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.adapteeMethod();
		
		t.adapterMethod();
	}
}
