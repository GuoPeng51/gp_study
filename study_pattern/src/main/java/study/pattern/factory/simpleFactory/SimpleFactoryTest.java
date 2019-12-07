package study.pattern.factory.simpleFactory;

import study.pattern.factory.common.IMobilePhone;
import study.pattern.factory.common.MiPhone;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        MobilePhoneFactory mobilePhoneFactory = new MobilePhoneFactory();
        IMobilePhone miPhone = mobilePhoneFactory.instance(MiPhone.class);
        miPhone.start();
    }
}
