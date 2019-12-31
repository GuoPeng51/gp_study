package study.pattern.template.course;

public class JavaCourse extends NetworkCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Java 的架构课件");
    }
}
