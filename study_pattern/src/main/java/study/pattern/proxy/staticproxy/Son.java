package study.pattern.proxy.staticproxy;

import study.pattern.proxy.Person;

public class Son implements Person {
    @Override
    public void findHouse() {
        System.out.println("Son findHouse");
    }
}
