package study.pattern.factory.simpleFactory;

import study.pattern.factory.common.IMobilePhone;

public class MobilePhoneFactory {
    public IMobilePhone instance(Class<? extends IMobilePhone> clazz){
        try {
            if (clazz != null){
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
