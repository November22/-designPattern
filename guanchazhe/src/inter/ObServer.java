package inter;

public abstract class ObServer {
	
//	private Subject subject;
	
	//应该spring中自动注入
	public ObServer(Subject subject){
		subject.addObServer(this);
	}
	
	//此处应该是AutoWired
	
//	public void setSubject(Subject subject){
//		this.subject = subject;
//	};
	
	public abstract void update();
}
