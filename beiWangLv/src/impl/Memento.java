package impl;

/**
 * ����¼
 * ����洢�����˵��ڲ�״̬������Ҫ��ʱ���ṩ��������Ҫ���ڲ�״̬
 * @author sen.huang
 *
 */
public class Memento {
	private String state = "";
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	
}
