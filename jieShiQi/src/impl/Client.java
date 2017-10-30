package impl;

import java.util.Stack;

import abs.Expression;

public class Client {
	public static void main(String[] args) {
		String expression = "";
		char[] charArray = expression.toCharArray();
		Context ctx = new Context();
		Stack<Expression> stack = new Stack<>();
		for(int i=0;i<charArray.length;i++){
			//进行语法判断，递归调用
		}
		Expression exp = stack.pop();
		exp.interpeter(ctx);
	}
}
