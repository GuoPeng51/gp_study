package study.pattern.proxy.dbroute;

public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao insert:"+order);
        return 1;
    }
}
