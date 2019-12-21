package study.pattern.strategy.schoolwork;

import java.util.Set;

public class BussinessService {

    public void NoticeType(Object bus){
        System.out.println("NoticeType");
    };

    public void NonNoticeType(Object bus){
        System.out.println("NonNoticeType");
    };


    public void TestType1(Object bus){
        System.out.println("TestType1");
    };


    public void TestType2(Object bus){
        System.out.println("TestType2");
    };


    public void directDeveloper(Object bus){
        System.out.println("directDeveloper");
    };
}
