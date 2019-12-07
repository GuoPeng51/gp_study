package study.pattern.factory.abstractFactory;

import study.pattern.factory.common.HuaWeiPhone;
import study.pattern.factory.common.HuaWeiWatch;
import study.pattern.factory.common.IMobilePhone;
import study.pattern.factory.common.IWatch;

public class HuaWeiFactory implements IAbstractFactory {
    @Override
    public IMobilePhone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IWatch createWatch() {
        return new HuaWeiWatch();
    }
}
