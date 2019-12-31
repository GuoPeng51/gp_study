package study.pattern.decorator.battercake;

public class EggDecorator extends BattercakeDecorator {
    @Override
    protected void doSomething() {

    }

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
