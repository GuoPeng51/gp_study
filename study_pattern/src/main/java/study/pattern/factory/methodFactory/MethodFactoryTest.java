package study.pattern.factory.methodFactory;

import study.pattern.factory.common.IMobilePhone;

public class MethodFactoryTest {
    public static void main(String[] args) {
        IMobilePhoneFactory huaWeiPhoneFactory = new HuaWeiPhoneFactory();
        IMobilePhone huaWeiPhone = huaWeiPhoneFactory.instance();
        huaWeiPhone.start();
    }
}
