package com.gp.study.pattern.methodFactory;

import com.gp.study.pattern.common.IMobilePhone;
import com.gp.study.pattern.common.MiPhone;

public class MiPhoneFactory implements IMobilePhoneFactory {
    @Override
    public IMobilePhone instance() {
        return new MiPhone();
    }
}
