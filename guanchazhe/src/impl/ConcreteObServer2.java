package impl;

import inter.ObServer;
import inter.Subject;

/**
 * 观察者实现
 * @author sen.huang
 *
 */
public class ConcreteObServer2 extends ObServer{

	public ConcreteObServer2(Subject subject){
		super(subject);
	}
	
	@Override
	public void update() {
		System.out.println("观察者2接收到消息，并进行处理");
		
	}

}
