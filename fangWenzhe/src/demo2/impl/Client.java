package demo2.impl;

import java.util.List;

import demo2.abs.Element;

public class Client {
	public static void main(String[] args) {
		List<Element> list = ObjectStructure.getList();
		for(Element e:list){
			e.accept(new Visitor());
		}
	}
}
