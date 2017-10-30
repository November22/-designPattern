package demo2.abs;

import demo2.impl.ConcreteElement1;
import demo2.impl.ConcreteElement2;

public interface IVistor {
	public void visit(ConcreteElement1 concreteElement1);
	public void visit(ConcreteElement2 concreteElement2);
}
