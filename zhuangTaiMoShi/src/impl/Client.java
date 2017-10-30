package impl;

public class Client {
	public static void main(String[] args) {
		Context c = new Context();
		c.setWeather(new Sunshine());
		System.out.println(c.weatherMessage());
	}
}
