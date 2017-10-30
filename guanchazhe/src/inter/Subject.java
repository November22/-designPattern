package inter;

import java.util.Vector;

/**
 * ±ªπ€≤Ï’ﬂ
 * @author sen.huang
 *
 */
public abstract class Subject {
	private Vector<ObServer> obs = new Vector<>();
	
	public void addObServer(ObServer obServer){
		obs.add(obServer);
	}
	
	public void delObServer(ObServer obServer){
		this.obs.remove(obServer);
	}
	
	protected void notifyObServer() {
		for(ObServer obServer:obs){
			obServer.update();
		}
	}
	
	public abstract void doSomething();
}
