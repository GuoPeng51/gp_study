package study.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        eventbus.register(new GuavaEvent());
        eventbus.post("GP");
    }
}
