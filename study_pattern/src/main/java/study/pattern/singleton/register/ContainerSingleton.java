package study.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton(){}
    private static final Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if (ioc.containsKey(className)){
               return ioc.get(className);
            }else{
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            }
        }
    }
}
