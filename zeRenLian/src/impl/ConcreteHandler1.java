package impl;

import abs.Handler;

public class ConcreteHandler1 extends Handler{

	@Override
	protected Level getHandlerLevel() {
		// TODO Auto-generated method stub
		return new Level(1);
	}

	@Override
	public Response response(Request request) {
		System.out.println("�ɴ�����1���д���");
		return null;
	}

}
