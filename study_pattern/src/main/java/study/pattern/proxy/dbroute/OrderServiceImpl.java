package study.pattern.proxy.dbroute;

public class OrderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl createOrder");
        return orderDao.insert(order);
    }
}
