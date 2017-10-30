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
		System.out.println("由处理器1进行处理");
		return null;
	}

}
