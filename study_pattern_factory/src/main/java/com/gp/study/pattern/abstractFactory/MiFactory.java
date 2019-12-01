package com.gp.study.pattern.abstractFactory;

import com.gp.study.pattern.common.*;

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
