package impl;

import inter.Subject;

/**
 * ���۲��߾���ʵ��
 * @author sen.huang
 *
 */
public class ConcreteSubject extends Subject{

	@Override
	public void doSomething() {
		System.out.println("���۲����¼�����");
		this.notifyObServer();
	}

}
