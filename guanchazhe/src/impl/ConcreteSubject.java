package impl;

import inter.Subject;

/**
 * 被观察者具体实现
 * @author sen.huang
 *
 */
public class ConcreteSubject extends Subject{

	@Override
	public void doSomething() {
		System.out.println("被观察者事件发生");
		this.notifyObServer();
	}

}
