package study.pattern.template.jdbc;

public class Member {
    private String username;
    private String password;
    private String nickName;
    private int age;
    private String addr;

    public String getUsername() {
        return username;
    }

    public Member setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Member setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public Member setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Member setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public Member setAddr(String addr) {
        this.addr = addr;
        return this;
    }
}
