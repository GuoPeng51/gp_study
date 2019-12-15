package study.pattern.proxy.cglibproxy;

import study.pattern.proxy.Customer;
import study.pattern.proxy.Person;
import study.pattern.proxy.gpproxy.GPZhongjie;


public class CglibTest {
    public static void main(String[] args) throws Exception{
        Person custom = (Person)new CGLIBZhongJie().getInstance(Customer.class);
        custom.findHouse();
    }
}
