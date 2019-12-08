package study.pattern.prototype.simple;

import java.util.List;

public class PrototypeA implements  Prototype{
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public PrototypeA clone() {
        PrototypeA prototype = new PrototypeA();
        prototype.setAge(this.age);
        prototype.setName(this.name);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }
}
