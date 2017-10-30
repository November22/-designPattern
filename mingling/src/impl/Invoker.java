package impl;

import abs.Command;

/**
 * 调用者，负责调用命令
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
