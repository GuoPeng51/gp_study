package study.pattern.singleton;

import study.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import study.pattern.singleton.lazy.LazyInnerClassSingleton;
import study.pattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
