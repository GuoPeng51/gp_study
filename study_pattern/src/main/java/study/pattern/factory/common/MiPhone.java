package study.pattern.factory.common;

public class MiPhone implements IMobilePhone {
    @Override
    public void start() {
        System.out.printf("小米手机");
    }
}
