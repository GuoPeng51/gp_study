package com.gp.study.pattern.methodFactory;

import com.gp.study.pattern.common.IMobilePhone;

public class MethodFactoryTest {
    public static void main(String[] args) {
        IMobilePhoneFactory huaWeiPhoneFactory = new HuaWeiPhoneFactory();
        IMobilePhone huaWeiPhone = huaWeiPhoneFactory.instance();
        huaWeiPhone.start();
    }
}
