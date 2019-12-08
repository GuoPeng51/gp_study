package study.pattern.prototype.simple;

import java.util.ArrayList;

public class PrototypeTest {
    public static void main(String[] args) {
        PrototypeA prototypeA = new PrototypeA();
        prototypeA.setName("lyj");
        prototypeA.setAge(35);
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("唱歌");
        prototypeA.setHobbies(hobbies);
        PrototypeA prototype = (PrototypeA) Client.startClone(prototypeA);

        System.out.println("克隆对象中的引用类型地址值：" + prototype.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + prototypeA.getHobbies());
        System.out.println("对象地址比较："+(prototypeA.getHobbies() == prototype.getHobbies()));
    }
}
