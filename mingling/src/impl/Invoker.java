package impl;

import abs.Command;

/**
 * �����ߣ������������
 * @author sen.huang
 *
 */
public class Invoker {
	private Command command;
	public void setCommand(Command com){
		this.command = com;
	}
	
	public void action(){
		this.command.execute();
	}
}
