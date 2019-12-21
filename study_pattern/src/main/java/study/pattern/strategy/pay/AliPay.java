package study.pattern.strategy.pay;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "AliPay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 888;
    }
}
