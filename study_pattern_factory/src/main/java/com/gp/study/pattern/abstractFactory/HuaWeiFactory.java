package com.gp.study.pattern.abstractFactory;

import com.gp.study.pattern.common.HuaWeiPhone;
import com.gp.study.pattern.common.HuaWeiWatch;
import com.gp.study.pattern.common.IMobilePhone;
import com.gp.study.pattern.common.IWatch;

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
