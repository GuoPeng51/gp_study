package study.pattern.decorator.battercake;

public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼果子";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
