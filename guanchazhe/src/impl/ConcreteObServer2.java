package impl;

import inter.ObServer;
import inter.Subject;

/**
 * �۲���ʵ��
 * @author sen.huang
 *
 */
public class ConcreteObServer2 extends ObServer{

	public ConcreteObServer2(Subject subject){
		super(subject);
	}
	
	@Override
	public void update() {
		System.out.println("�۲���2���յ���Ϣ�������д���");
		
	}

}
