package impl;

import abs.Facade;
import abs.ServiceA;
import abs.ServiceB;
import abs.ServiceC;

public class FacadeImpl implements Facade{

	ServiceA sa;
	ServiceB sb;
	ServiceC sc;
	
	//@AutoWired
	public FacadeImpl() {
		sa = new ServiceAImpl();
		sb = new ServiceBImpl();
		sc = new ServiceCImpl();
	}
	
	
	@Override
	public void method1() {
		sa.ma();
		sb.mb();
		System.out.println("sa��sb��ϳɶ������method1");
		
	}

	@Override
	public void method2() {
		sa.ma();
		sb.mb();
		sc.mc();
		System.out.println("sa��sb��sc��ϳ��˶������method2");
		
	}

}
