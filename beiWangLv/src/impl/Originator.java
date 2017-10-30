package impl;

/**
 * ������
 * ��¼��ǰʱ�̵��ڲ�״̬����������Щ���ڱ��ݷ�Χ��״̬�����𴴽��ͻָ�����¼����
 * @author sen.huang
 *
 */
public class Originator {
	private String state = "";
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	/**
	 * �ָ�֮ǰ������
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}