/**
 * @Auther: He Lingbo
 * @Date: 2019/3/12
 * @Description:实现了接口的委托类
 */
public class Wanda implements Cinema {
    public void sellTickets() {
        System.out.println("买万达的电影票");
    }
    public void ad() {
        System.out.println("看到万达的广告");
    }

}
