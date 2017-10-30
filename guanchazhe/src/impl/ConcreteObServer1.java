package impl;

import inter.ObServer;
import inter.Subject;

/**
 * 观察者具体实现
 * @author sen.huang
 *
 */
public class ConcreteObServer1 extends ObServer{
	public ConcreteObServer1(Subject subject){
		super(subject);
	}
	
	
	@Override
	public void update() {
		System.out.println("观察者1收到信息，业务处理");
	}

}
