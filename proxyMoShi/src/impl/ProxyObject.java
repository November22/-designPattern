package impl;

import abs.Object;

/**
 * Proxy:保存一个引用可以访问实体，此处是Object
 * @author sen.huang
 *
 */
public class ProxyObject implements Object{

	Object object;
	
	public ProxyObject() {
		System.out.println("这是代理类");
		object = new ObjectImpl();
	}
	
	@Override
	public void action() {
		System.out.println("代理开始");
		object.action();
		System.out.println("代理结束");
	}
}
