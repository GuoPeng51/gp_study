package study.pattern.factory.methodFactory;

import study.pattern.factory.common.IMobilePhone;
import study.pattern.factory.common.MiPhone;

public class MiPhoneFactory implements IMobilePhoneFactory {
    @Override
    public IMobilePhone instance() {
        return new MiPhone();
    }
}
