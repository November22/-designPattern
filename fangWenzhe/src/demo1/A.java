package demo1;

public class A {
	public void method1(){
		System.out.println("����A");
	}
	
	public void method2(B b){
		b.showA(this);
	}
}
