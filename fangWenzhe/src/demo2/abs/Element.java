package demo2.abs;

/**
 * 元素类，被访问者
 * 1.自己的业务代码
 * 2.可以被哪些访问者访问
 * @author sen.huang
 *
 */
public abstract class Element {
	public abstract void accept(IVistor iVistor);
	public abstract void doSomthing();
}
