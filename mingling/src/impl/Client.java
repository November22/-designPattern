package impl;

import abs.Command;

public class Client {
	public static void main(String[] args) {
		//1.命令直接调用接收者
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		c.execute();
		
		//2.调用类调用命令，然后接收者接收命令，执行业务处理
		Invoker i = new Invoker();
		i.setCommand(c);
		i.action();
	}
}
