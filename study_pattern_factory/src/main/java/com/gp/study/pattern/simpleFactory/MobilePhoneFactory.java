package com.gp.study.pattern.simpleFactory;

import com.gp.study.pattern.common.HuaWeiPhone;
import com.gp.study.pattern.common.IMobilePhone;
import com.gp.study.pattern.common.MiPhone;

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
