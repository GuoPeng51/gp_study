package study.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String APPLE_PAY = "ApplePay";
    public static final String DEFAULT_PAY = ALI_PAY;
    private static final Map<String,Payment> payStrategy = new HashMap<String,Payment>();
    static{
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WeChatPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(JD_PAY,new JdPay());
        payStrategy.put(APPLE_PAY,new ApplePay());
    }

    public static Payment get(String payKey){
        Payment payment = payStrategy.get(payKey);
        return payment == null ? payStrategy.get(DEFAULT_PAY) : payment;
    }
}
