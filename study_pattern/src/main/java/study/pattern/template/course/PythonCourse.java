package study.pattern.template.course;

public class PythonCourse extends NetworkCourse {
    private boolean homeworkFlag = false;

    public PythonCourse(boolean homeworkFlag) {
        this.homeworkFlag = homeworkFlag;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.homeworkFlag;
    }
}
