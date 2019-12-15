package study.pattern.proxy.gpproxy;

import study.pattern.proxy.Person;
import study.pattern.proxy.Customer;

public class GPTest {
    public static void main(String[] args) throws Exception{
        Person custom = (Person)new GPZhongjie().getInstance(new Customer());
        custom.findHouse();
    }
}
