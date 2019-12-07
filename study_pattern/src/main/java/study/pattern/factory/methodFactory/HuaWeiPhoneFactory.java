package study.pattern.factory.methodFactory;

import study.pattern.factory.common.HuaWeiPhone;
import study.pattern.factory.common.IMobilePhone;

public class HuaWeiPhoneFactory implements IMobilePhoneFactory {
    @Override
    public IMobilePhone instance() {
        return new HuaWeiPhone();
    }
}
