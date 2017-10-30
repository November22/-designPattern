package impl2;

public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		o.setState1("中国");
		o.setState2("美国");
		o.setState3("德国");
		System.out.println("初始态："+o.toString());
		
		c.setMemento("001", o.createMemento());
		
		o.setState1("哈");
		o.setState2("和");
		o.setState3("0");
		System.out.println("态2："+o.toString());
		
		o.restoreMemento(c.getMemento("001"));
		System.out.println("恢复："+o.toString());
	}
}
