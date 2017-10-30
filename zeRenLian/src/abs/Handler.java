package abs;

import impl.Level;
import impl.Request;
import impl.Response;

/**
 * 抽象处理类
 * 1.处理请求
 * 2.指向下一个处理类
 * @author sen.huang
 *
 */
public abstract class Handler {
	private Handler nextHandler;
	
	/**
	 * 是否在此处执行的条件
	 * @return
	 */
	protected abstract Level getHandlerLevel();
	
	/**
	 * 对请求的响应
	 * @param request
	 * @return
	 */
	public abstract Response response(Request request);
	
	public void setNextHandler(Handler handler){
		this.nextHandler = handler;
	}
	
	/**
	 * 处理请求
	 * @param request
	 * @return
	 */
	public final Response handleRequest(Request request){
		Response response = null;
		if(this.getHandlerLevel().above(request.getLevel())){
			response = this.response(request);
		}else{
			if(this.nextHandler != null){
				this.nextHandler.handleRequest(request);
			}else{
				System.out.println("-------么有合适的处理器------");
			}
		}
		return response;
	}
}
