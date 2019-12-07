package study.pattern.singleton.hungry;

public class HungryStaticSingleton {
    private static final HungryStaticSingleton INSTANCE;
    static{
        INSTANCE = new HungryStaticSingleton();
    }
    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getSingleton() {
        return INSTANCE;
    }
}
