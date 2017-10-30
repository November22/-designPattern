package abs;

/**
 * ����һ��������ӿ�
 * ά��һ��ָ��Implementor���Ͷ����ָ��
 * 
 * Person��ά����Clothing
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
