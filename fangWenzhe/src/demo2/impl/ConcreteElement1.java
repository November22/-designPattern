package demo2.impl;

import demo2.abs.Element;
import demo2.abs.IVistor;

public class ConcreteElement1 extends Element{

	@Override
	public void accept(IVistor iVistor) {
		iVistor.visit(this);
		
	}

	@Override
	public void doSomthing() {
		System.out.println("ÕâÊÇÔªËØ1");
		
	}

}
