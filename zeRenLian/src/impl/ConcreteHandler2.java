package impl;

import abs.Handler;

public class ConcreteHandler2 extends Handler{

	@Override
	protected Level getHandlerLevel() {
		// TODO Auto-generated method stub
		return new Level(3);
	}

	@Override
	public Response response(Request request) {
		System.out.println("������2���д���");
		return null;
	}

}
