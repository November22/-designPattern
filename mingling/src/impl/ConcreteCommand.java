package impl;

import abs.Command;

/**
 * �����ʵ��
 * @author sen.huang
 *
 */
public class ConcreteCommand extends Command{

	private Receiver r;
	
	public ConcreteCommand(Receiver r) {
		this.r = r;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.r.doSomthing();
	}

}
