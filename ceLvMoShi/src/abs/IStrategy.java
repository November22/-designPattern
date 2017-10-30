package abs;

/**
 * 抽象策略
 * 如果策略实现类之间存在重复的代码，可以将接口置换抽象类，在抽象类中封装重复代码
 * @author sen.huang
 *
 */
public interface IStrategy {
	public void doSomthing();
}
