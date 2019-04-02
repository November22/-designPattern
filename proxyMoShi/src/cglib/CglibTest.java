package cglib;

/**
 * @author sen.huang
 * @date 2019/4/2.
 */
public class CglibTest {
    public static void main(String[] args) {
        User user = new User();
        CglibProxy cglibProxy = new CglibProxy(user);
        User userProxy = cglibProxy.getUserProxy();
        userProxy.eat();
    }
}
