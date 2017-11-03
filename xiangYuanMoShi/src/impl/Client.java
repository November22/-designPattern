package impl;

import abs.Flyweight;

public class Client {
	public static void main(String[] args) {
		Flyweight f1 = FlyweightFactory.getFlyweight("a");
		f1.action(1);
		Flyweight f2 = FlyweightFactory.getFlyweight("a");
		System.out.println(f1 == f2);
		Flyweight f3 = FlyweightFactory.getFlyweight("b");
		f3.action(2);
	}
}
