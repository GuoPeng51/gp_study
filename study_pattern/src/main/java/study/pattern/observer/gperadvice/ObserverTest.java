package study.pattern.observer.gperadvice;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Question question = new Question();
        question.setContent("包装模式的种类");
        question.setUserName("gp");
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        gPer.addObserver(tom);
        gPer.addObserver(mic);
        gPer.publishQuestion(question);
    }
}
