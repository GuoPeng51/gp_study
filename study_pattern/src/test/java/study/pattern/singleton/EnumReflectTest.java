package study.pattern.singleton;

import study.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            EnumSingleton instance = (EnumSingleton)declaredConstructor.newInstance("Test",0);
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
