package impl;

import abs.Person;

/**
 * 定义一个对象，可以给这个对象动态的添加一些职责
 * @author sen.huang
 *
 */
public class Man implements Person{

	@Override
	public void chuan() {
		System.out.println("开始穿衣服");
	}

}
