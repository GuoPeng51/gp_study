package study.pattern.proxy.jdkproxy;

import study.pattern.proxy.Customer;
import study.pattern.proxy.Person;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKZhongJie().getInstance(new Customer());
            person.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
