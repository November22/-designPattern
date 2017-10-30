package impl;

import abs.Target;

/**
 * 对Adaptee的接口与Target接口进行适配
 * @author sen.huang
 *
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void adapteeMethod() {
		adaptee.adapteeMethod();
	}

	@Override
	public void adapterMethod() {
		System.out.println("Adapter method");
	}

}
