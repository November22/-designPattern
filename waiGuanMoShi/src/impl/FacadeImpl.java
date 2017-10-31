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
		System.out.println("sa和sb组合成对外服务method1");
		
	}

	@Override
	public void method2() {
		sa.ma();
		sb.mb();
		sc.mc();
		System.out.println("sa、sb和sc组合成了对外服务method2");
		
	}

}
