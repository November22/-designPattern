package impl;

import abs.Object;

/**
 * Proxy:����һ�����ÿ��Է���ʵ�壬�˴���Object
 * @author sen.huang
 *
 */
public class ProxyObject implements Object{

	Object object;
	
	public ProxyObject() {
		System.out.println("���Ǵ�����");
		object = new ObjectImpl();
	}
	
	@Override
	public void action() {
		System.out.println("����ʼ");
		object.action();
		System.out.println("�������");
	}
}
