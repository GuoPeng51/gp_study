package com.gp.study.pattern.abstractFactory;

import com.gp.study.pattern.common.IMobilePhone;
import com.gp.study.pattern.common.IWatch;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IAbstractFactory huaweiFactory = new HuaWeiFactory();
        IMobilePhone huaweiPhone = huaweiFactory.createPhone();
        IWatch huaweiWatch = huaweiFactory.createWatch();
        huaweiPhone.start();
        huaweiWatch.start();

        IAbstractFactory miFactory = new MiFactory();
        IMobilePhone miPhone = miFactory.createPhone();
        IWatch miWatch = miFactory.createWatch();
        miPhone.start();
        miWatch.start();

    }
}
