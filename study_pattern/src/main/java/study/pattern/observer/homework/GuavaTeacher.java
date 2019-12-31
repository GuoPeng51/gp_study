package study.pattern.observer.homework;

import com.google.common.eventbus.Subscribe;
import study.pattern.observer.gperadvice.GPer;
import study.pattern.observer.gperadvice.Question;

public class GuavaTeacher {
    private String name;
    public GuavaTeacher(String name){
        this.name = name;
    }

    @Subscribe
    public void getMessage(Object arg) {
        GuavaQuestion question = (GuavaQuestion)arg;

        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +"提问者：" + question.getUserName());
    }
}
