package com.gp.study.pattern.abstractFactory;

import com.gp.study.pattern.common.IMobilePhone;
import com.gp.study.pattern.common.IWatch;

public interface IAbstractFactory {
    public IMobilePhone createPhone();
    public IWatch createWatch();
}
