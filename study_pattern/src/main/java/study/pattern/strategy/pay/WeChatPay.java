package study.pattern.strategy.pay;

public class WeChatPay extends  Payment {
    @Override
    public String getName() {
        return "WeChatPay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 777;
    }
}
