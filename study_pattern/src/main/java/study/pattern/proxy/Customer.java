package study.pattern.proxy;

import study.pattern.proxy.Person;

public class Customer implements Person,Comparable{
    @Override
    public void findHouse() {
        System.out.println("Customer findHouse");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
