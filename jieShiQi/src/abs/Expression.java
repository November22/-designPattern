package abs;

import impl.Context;

/**
 * 抽象解释器
 * 可以用来制作规则引擎
 * @author sen.huang
 *
 */
public abstract class Expression {
	public abstract Object interpeter(Context ctx);
}
