package study.pattern.observer.events;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventLisenter {
    //JDK 底层的Lisenter 通常也是这样来设计的
    protected Map<String,Event> events = new HashMap<String,Event>();

    public void addLisenter(String eventType, Object target, Method callback){
        //注册事件
        events.put(eventType, new Event(target, callback));
    }


    //事件名称和一个目标对象来触发事件
    public void addLisenter(String eventType,Object target) throws Exception {
        this.addLisenter(eventType,target,target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class));
    }

    //触发，只要有动作就触发
    private void trigger(Event event) throws Exception {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        //发起回调
        if(event.getCallback() != null){
            //用反射调用它的回调函数
            event.getCallback().invoke(event.getTarget(),event);
        }

    }

    //事件名称触发
    protected void trigger(String trigger){
        try {
            if(!this.events.containsKey(trigger)){return;}
            trigger(this.events.get(trigger).setTrigger(trigger));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //逻辑处理的私有方法，首字母大写
    private String toUpperFirstCase(String str){
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
