package study.pattern.strategy.promotion;

public class PromotionTest {
    public static void main(String[] args) {
        String promotionKey = "null";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
