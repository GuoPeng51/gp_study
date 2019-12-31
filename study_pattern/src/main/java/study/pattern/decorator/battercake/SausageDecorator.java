package study.pattern.decorator.battercake;

public class SausageDecorator extends BattercakeDecorator {
    @Override
    protected void doSomething() {

    }

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"烤肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
