package impl;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Context con ;
				con = new Context(new ConcreteStrategy1());
				con.execute();
				con = new Context(new ConcreteStrategy2());
				con.execute();
	}
}
