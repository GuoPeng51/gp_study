package study.pattern.strategy.pay;

public class ApplePay extends Payment {
    @Override
    public String getName() {
        return "ApplePay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}
