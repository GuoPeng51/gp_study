package study.pattern.factory.common;

public class MiWatch implements IWatch {
    @Override
    public void start() {
        System.out.printf("小米手环");
    }
}
