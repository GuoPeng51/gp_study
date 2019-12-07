package study.pattern.singleton;

import study.pattern.singleton.hungry.HungrySingleton;
import study.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = HungrySingleton.class;
            Constructor declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            HungrySingleton instance = (HungrySingleton)declaredConstructor.newInstance();
            HungrySingleton singleton = HungrySingleton.getSingleton();
            System.out.println(instance);
            System.out.println(singleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
