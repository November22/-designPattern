package jdkPoxy;

/**
 * @author sen.huang
 * @date 2019/4/2.
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        People people = new Man();
        JdkProxy jdkProxy = new JdkProxy(people);
        People proxyPeople = jdkProxy.getProxyPeople();
        proxyPeople.eat();
    }
}
