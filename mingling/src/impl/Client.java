package impl;

import abs.Command;

public class Client {
	public static void main(String[] args) {
		//1.����ֱ�ӵ��ý�����
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		c.execute();
		
		//2.������������Ȼ������߽������ִ��ҵ����
		Invoker i = new Invoker();
		i.setCommand(c);
		i.action();
	}
}
