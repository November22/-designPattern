package abs;

/**
 * 定义一个抽象类接口
 * 维护一个指向Implementor类型对象的指针
 * 
 * Person是维护的Clothing
 * @author sen.huang
 *
 */
public abstract class Person {
	private String type;

	private Clothing clothing;
	
	public Clothing getClothing() {
		return clothing;
	}

	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void dress();
	
}
