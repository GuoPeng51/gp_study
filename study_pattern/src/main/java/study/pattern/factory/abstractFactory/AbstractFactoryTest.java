package study.pattern.factory.abstractFactory;

import study.pattern.factory.common.IMobilePhone;
import study.pattern.factory.common.IWatch;

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
