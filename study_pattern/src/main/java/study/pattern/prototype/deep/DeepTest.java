package study.pattern.prototype.deep;

import java.util.ArrayList;

public class DeepTest {
    public static void main(String[] args) {
        Deep deep = new Deep();
        deep.setName("lyj");
        deep.setAge(35);
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("唱歌");
        deep.setHobbies(hobbies);
        try {
            Deep clone = (Deep)deep.clone();
            System.out.println("深克隆：" + (clone.getHobbies() == deep.getHobbies()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
