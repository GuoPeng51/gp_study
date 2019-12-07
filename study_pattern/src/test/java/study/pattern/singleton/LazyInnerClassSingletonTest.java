package study.pattern.singleton;

import study.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
//            Class<?> clazz = LazyInnerClassSingleton.class;
//            Constructor declaredConstructor = clazz.getDeclaredConstructor();
//            declaredConstructor.setAccessible(true);
//            Object o1 = declaredConstructor.newInstance();
//            Object o2 = declaredConstructor.newInstance();
            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//            System.out.println(o1);
//            System.out.println(o2);
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}
