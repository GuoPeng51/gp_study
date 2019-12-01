package com.gp.study.pattern.simpleFactory;

import com.gp.study.pattern.common.IMobilePhone;
import com.gp.study.pattern.common.MiPhone;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        MobilePhoneFactory mobilePhoneFactory = new MobilePhoneFactory();
        IMobilePhone miPhone = mobilePhoneFactory.instance(MiPhone.class);
        miPhone.start();
    }
}
