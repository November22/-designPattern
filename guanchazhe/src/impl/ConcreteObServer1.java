package impl;

import inter.ObServer;
import inter.Subject;

/**
 * �۲��߾���ʵ��
 * @author sen.huang
 *
 */
public class ConcreteObServer1 extends ObServer{
	public ConcreteObServer1(Subject subject){
		super(subject);
	}
	
	
	@Override
	public void update() {
		System.out.println("�۲���1�յ���Ϣ��ҵ����");
	}

}
