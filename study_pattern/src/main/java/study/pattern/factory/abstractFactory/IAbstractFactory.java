package study.pattern.factory.abstractFactory;

import study.pattern.factory.common.IMobilePhone;
import study.pattern.factory.common.IWatch;

public interface IAbstractFactory {
    public IMobilePhone createPhone();
    public IWatch createWatch();
}
