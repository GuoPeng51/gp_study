package study.pattern.observer.homework;

import com.google.common.eventbus.EventBus;
import study.pattern.observer.gperadvice.Question;
import study.pattern.observer.guava.GuavaEvent;

public class GuavaGPerTest {
    public static void main(String[] args) {
        EventBus eventbus = new GuavaGPer();
        eventbus.register(new GuavaTeacher("Tom"));
        GuavaQuestion question = new GuavaQuestion();
        question.setContent("包装模式的种类");
        question.setUserName("gp");
        eventbus.post(question);
    }
}
