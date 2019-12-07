package study.pattern.factory.common;

public class HuaWeiPhone implements IMobilePhone {
    @Override
    public void start() {
        System.out.printf("华为手机");
    }
}
