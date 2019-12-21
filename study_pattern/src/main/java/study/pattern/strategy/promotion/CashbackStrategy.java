package study.pattern.strategy.promotion;

public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("消费返现活动");
    }
}
