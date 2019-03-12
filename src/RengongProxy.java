import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * @Auther: He Lingbo
 * @Date: 2019/3/12
 * @Description:使用CGLib进行代理，可以代理没实现接口的类
 */
public class RengongProxy implements  MethodInterceptor   {
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这里是人工售票窗口。");
        return methodProxy.invokeSuper(obj, objects);
    }
}
