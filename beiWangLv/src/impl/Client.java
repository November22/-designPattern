package impl;


/**
 * �ǳ��򵥵�һ�����ӣ�Originator���е�state������Ҫ���ݣ��Ա�����Ҫ��ʱ��ָ���Memento���У�Ҳ��һ��state
 * �����������洢Originator���е�state��������ʱ״̬����Caretakerʹ������������¼���
 * @author sen.huang
 *
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("״̬1");
		System.out.println("��ʼ״̬��"+originator.getState());
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		
		originator.setState("״̬2");
		System.out.println("�ı���״̬��"+originator.getState());
		
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("�ָ�֮ǰ��״̬��"+originator.getState());
	}
}
