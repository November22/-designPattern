package impl;


/**
 * 非常简单的一个例子，Originator类中的state变量需要备份，以便在需要的时候恢复；Memento类中，也有一个state
 * 变量，用来存储Originator类中的state变量的临时状态；而Caretaker使用用来管理备忘录类的
 * @author sen.huang
 *
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("状态1");
		System.out.println("初始状态："+originator.getState());
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		
		originator.setState("状态2");
		System.out.println("改变后的状态："+originator.getState());
		
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复之前的状态："+originator.getState());
	}
}
