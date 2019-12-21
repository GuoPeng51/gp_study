package study.pattern.strategy.pay;

public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("1","20180311001000009",776);
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
