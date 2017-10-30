package demo2.impl;

import demo2.abs.IVistor;

public class Visitor implements IVistor{

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomthing();
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomthing();
	}

}
