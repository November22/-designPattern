package abs;

/**
 * ÈÝÆ÷½Ó¿Ú
 * @author sen.huang
 *
 */
public interface Aggregate {
	public void add(Object obj);
	public void remove(Object obj);
	public Iterator iterator();
}
