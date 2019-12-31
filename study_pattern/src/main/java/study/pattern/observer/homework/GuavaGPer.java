package study.pattern.observer.homework;

import com.google.common.eventbus.EventBus;

public class GuavaGPer extends EventBus {
    private String name = "GPer 生态圈";
    public String getName() {
        return name;
    }

    @Override
    public void post(Object event) {
        System.out.println("您收到了一个来自“"+ name +"”的提问");
        super.post(event);
    }
}
