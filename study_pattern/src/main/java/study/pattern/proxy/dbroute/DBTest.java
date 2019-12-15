package study.pattern.proxy.dbroute;

import java.util.Random;

public class DBTest {
    public static void main(String[] args) {
        Order order = new Order();
        Long id = new Random().nextLong();
        System.out.println(id%2);
        System.out.println(id);
        order.setId(id);
        //IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl(new OrderDao()));
        IOrderService orderService = (IOrderService)new OrderServiceStaticProxy().getInstance(new OrderServiceImpl(new OrderDao()));
        orderService.createOrder(order);
    }
}
