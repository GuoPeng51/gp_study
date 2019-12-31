package study.pattern.decorator.battercake;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();
        battercake =  new EggDecorator(battercake);
        battercake =  new EggDecorator(battercake);
        battercake =  new SausageDecorator(battercake);
        System.out.println(battercake.getMsg());
        System.out.println(battercake.getPrice());

    }
}
