package study.pattern.strategy.promotion;

public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("万人团优惠活动");
    }
}
