package study.pattern.proxy.gpproxy;

import java.lang.reflect.Method;

public class GPZhongjie implements GPInvocationHandler{
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before(){
        System.out.println("中介找房，中介提供带领看房");
    }

    private void after(){
        System.out.println("后期手续办理");
    }
}
