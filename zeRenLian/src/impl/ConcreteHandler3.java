package impl;

import abs.Handler;

public class ConcreteHandler3 extends Handler{

	@Override
	protected Level getHandlerLevel() {
		// TODO Auto-generated method stub
		return new Level(5);
	}

	@Override
	public Response response(Request request) {
		System.out.println("处理3处理");
		return null;
	}
	
}
