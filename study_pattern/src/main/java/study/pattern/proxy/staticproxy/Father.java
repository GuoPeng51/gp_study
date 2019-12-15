package study.pattern.proxy.staticproxy;

import study.pattern.proxy.Person;

public class Father implements Person {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findHouse() {
        System.out.println("Father help before");
        son.findHouse();
        System.out.println("Father help after");
    }
}
