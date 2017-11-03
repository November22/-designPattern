package impl;

import abs.Object;

/**
 * RealSubjectP:定义Proxy所代表的实体
 * @author sen.huang
 *
 */
public class ObjectImpl implements Object{

	@Override
	public void action() {
		System.out.println("========");
		System.out.println("这是被代理的类");
		System.out.println("========");
	}

}
