package study.pattern.proxy.staticproxy;

public class StaticTest {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);
        father.findHouse();
    }
}
