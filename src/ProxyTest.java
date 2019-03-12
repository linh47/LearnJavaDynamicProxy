import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @Auther: He Lingbo
 * @Date: 2019/3/12
 * @Description:测试代码
 */
public class ProxyTest {
    public static void main(String[] args)
    {
        /****java动态代理****/
        //第一种方法要 调用者自己创建代理类对象，比较麻烦
//        //创建中介类实例
//        TaopiaopiaoProxyHandler inter = new TaopiaopiaoProxyHandler(new Wanda());
//        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
//
//        //获取代理类实例sell
//        Cinema tao = (Cinema)(Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[] {Sell.class}, inter));
        //第二种方法在中介类里面直接返回代理类对象
        Cinema obj=new Wanda(); //委托类的对象
        Cinema taopiaopiao=(Cinema) new TaopiaopiaoProxyHandler().bind(obj);//创建代理类的对象
        //通过代理类对象调用代理类方法，实际上会转到invoke方法调用
        taopiaopiao.sellTickets();
        /****调用CGlib实现动态代理****/
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Xinhexing.class);
        enhancer.setCallback(new RengongProxy());
        Xinhexing xinhexing= (Xinhexing)enhancer.create();
        xinhexing.sellTickets();
     }
}
