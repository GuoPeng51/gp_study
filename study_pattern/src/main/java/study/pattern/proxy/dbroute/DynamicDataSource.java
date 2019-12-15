package study.pattern.proxy.dbroute;

public class DynamicDataSource {
    public final static Long DEFAULT_SOURCE = null;
    private final static ThreadLocal<Long> local = new ThreadLocal<Long>();

    private DynamicDataSource() {
    }

    /**
     * 获取当前正在使用的数据源名字
     *
     * @return String
     */
    public static Long get() {
        return local.get();
    }
    /**
     * 还原当前切面的数据源
     */
    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }
    /**
     * 设置已知名字的数据源
     *
     * @param source
     */
    public static void set(Long source) {
        local.set(source);
    }
}
