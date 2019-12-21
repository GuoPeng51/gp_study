package study.pattern.delegate.simple;

public class SimpleDelegateTest {
    public static void main(String[] args) {
        new Boss().doing("前端",new Leader());
    }
}
