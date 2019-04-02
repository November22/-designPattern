package jdkPoxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类维护目标对象
 * @author sen.huang
 * @date 2019/4/2.
 */
public class JdkProxy {

    /**
     * 目标对象
     */
    private People people;

    public JdkProxy(People people){
        this.people = people;
    }

    public People getProxyPeople(){
        return (People) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("先喝酒");
                method.invoke(people,args);
                System.out.println("后抽烟");
                return null;
            }
        });
    }

}
