package inter;

public abstract class ObServer {
	
//	private Subject subject;
	
	//Ӧ��spring���Զ�ע��
	public ObServer(Subject subject){
		subject.addObServer(this);
	}
	
	//�˴�Ӧ����AutoWired
	
//	public void setSubject(Subject subject){
//		this.subject = subject;
//	};
	
	public abstract void update();
}
