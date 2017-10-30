package abs;

import impl.Level;
import impl.Request;
import impl.Response;

/**
 * ��������
 * 1.��������
 * 2.ָ����һ��������
 * @author sen.huang
 *
 */
public abstract class Handler {
	private Handler nextHandler;
	
	/**
	 * �Ƿ��ڴ˴�ִ�е�����
	 * @return
	 */
	protected abstract Level getHandlerLevel();
	
	/**
	 * ���������Ӧ
	 * @param request
	 * @return
	 */
	public abstract Response response(Request request);
	
	public void setNextHandler(Handler handler){
		this.nextHandler = handler;
	}
	
	/**
	 * ��������
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
				System.out.println("-------ô�к��ʵĴ�����------");
			}
		}
		return response;
	}
}
