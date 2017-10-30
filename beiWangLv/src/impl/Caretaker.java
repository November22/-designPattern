package impl;

/**
 * 管理者角色：对备忘录进行管理，保存和提供备忘录
 * @author sen.huang
 *
 */
public class Caretaker {
	
	private Memento memento;
	public Memento getMemento(){
		return memento;
	}
	
	public void setMemento(Memento memento){
		this.memento = memento;
	}
	
}
