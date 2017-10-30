package impl;

import abs.IStrategy;

/**
 * 封装类，对策略类进行二次封装，避免高层模块对其的直接调用 
 * @author sen.huang
 *
 */
public class Context {
	private IStrategy iStrategy;
	
	public Context(IStrategy iStrategy){
		this.iStrategy = iStrategy;
	}
	
	public void execute(){
		iStrategy.doSomthing();
	}
	
}
