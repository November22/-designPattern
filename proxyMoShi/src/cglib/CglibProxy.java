package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sen.huang
 * @date 2019/4/2.
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 目标对象
     */
    private User user;

    public CglibProxy(User user){
        this.user = user;
    }

    /**
     * 获取目标对象的代理对象
     * @return
     */
    public User getUserProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(user.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        return (User)enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("先喝汤");
        method.invoke(user,objects);
        System.out.println("后吃钢");
        return null;
    }
}
