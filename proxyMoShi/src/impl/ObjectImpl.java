package impl;

import abs.Object;

/**
 * RealSubjectP:����Proxy�������ʵ��
 * @author sen.huang
 *
 */
public class ObjectImpl implements Object{

	@Override
	public void action() {
		System.out.println("========");
		System.out.println("���Ǳ��������");
		System.out.println("========");
	}

}
