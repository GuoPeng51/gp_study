package study.pattern.strategy.pay;

public class JdPay extends Payment {
    @Override
    public String getName() {
        return "JdPay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 666;
    }
}
