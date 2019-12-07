package study.pattern.factory.abstractFactory;

import study.pattern.factory.common.IMobilePhone;
import study.pattern.factory.common.IWatch;
import study.pattern.factory.common.MiPhone;
import study.pattern.factory.common.MiWatch;

public class MiFactory implements IAbstractFactory {
    @Override
    public IMobilePhone createPhone() {
        return new MiPhone();
    }

    @Override
    public IWatch createWatch() {
        return new MiWatch();
    }
}
