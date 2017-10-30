package impl;

import abs.IStrategy;

/**
 * ��װ�࣬�Բ�������ж��η�װ������߲�ģ������ֱ�ӵ��� 
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
