package zhuangshi;

public class Client {
	public static void main(String[] args) {
		Person person = new Personimpl();
		Tshirt t = new Tshirt();
		Kuzi k = new Kuzi();
		k.setPerson(person);
		t.setPerson(k);
		t.show();
	}
}
