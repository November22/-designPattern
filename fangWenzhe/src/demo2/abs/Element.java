package demo2.abs;

/**
 * Ԫ���࣬��������
 * 1.�Լ���ҵ�����
 * 2.���Ա���Щ�����߷���
 * @author sen.huang
 *
 */
public abstract class Element {
	public abstract void accept(IVistor iVistor);
	public abstract void doSomthing();
}
