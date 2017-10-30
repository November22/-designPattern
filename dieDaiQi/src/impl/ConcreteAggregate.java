package impl;

import java.util.ArrayList;
import java.util.List;

import abs.Aggregate;
import abs.Iterator;

/**
 * »›∆˜ µœ÷¿‡
 * @author sen.huang
 *
 */
public class ConcreteAggregate implements Aggregate{

	private List list = new ArrayList<>();
	
	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(list);
	}
	
}
