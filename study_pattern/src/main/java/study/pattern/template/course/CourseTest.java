package study.pattern.template.course;

public class CourseTest {
    public static void main(String[] args) {
        NetworkCourse j = new JavaCourse();
        NetworkCourse p = new PythonCourse(true);
        j.finishCourse();
        System.out.println("========================================");
        p.finishCourse();
    }
}
