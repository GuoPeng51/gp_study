package study.pattern.proxy.dbroute;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceStaticProxy implements InvocationHandler {

    public static final Integer DB_NUM = 2;

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

//    public OrderServiceStaticProxy(IOrderService orderService) {
//        this.orderService = orderService;
//    }

//    @Override
//    public int createOrder(Order order) {
//        before();
//        Long dbRouter = order.getId()%DB_NUM;
//        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
//        DynamicDataSource.set(dbRouter);
//        orderService.createOrder(order);
//        DynamicDataSource.restore();
//        after();
//        return 0;
//    }

    public void before(Object target) throws Exception{
        Long dbRouter = (Long) target.getClass().getMethod("getId").invoke(target)%DB_NUM;
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSource.set(dbRouter);
        System.out.println("Proxy before method.");
    }

    public void after() {
        DynamicDataSource.restore();
        System.out.println("Proxy after method.");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }
}
