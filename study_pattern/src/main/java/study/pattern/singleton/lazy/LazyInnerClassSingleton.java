package study.pattern.singleton.lazy;

public class LazyInnerClassSingleton {
    static {
        System.out.println("LazyInnerClassSingleton init");
    }
    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY  != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
