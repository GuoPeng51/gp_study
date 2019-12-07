package study.pattern.singleton.hungry;

public class HungrySingleton {
    private static final  HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        if (INSTANCE == null){
            throw new RuntimeException("无法创建多个实例");
        }
    }

    public static HungrySingleton getSingleton() {
        return INSTANCE;
    }
}
