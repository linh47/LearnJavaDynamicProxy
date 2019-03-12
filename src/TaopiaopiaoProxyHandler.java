import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: He Lingbo
 * @Date: 2019/3/12
 * @Description:使用java动态代理，只能代理实现了接口的类
 */
public class TaopiaopiaoProxyHandler implements InvocationHandler {
    //obj为委托类对象;
    private Object obj;

    public Object bind(Object obj) {
        this.obj = obj;
        //创建代理类的对象
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(obj.getClass()+",before method:"+method.getName());
        System.out.println("这里是淘票票在线购票平台。");
        Object result = method.invoke(obj, args);
//        System.out.println(obj.getClass()+",after method:"+method.getName());
        return result;
    }
}
