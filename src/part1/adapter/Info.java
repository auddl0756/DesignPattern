package part1.adapter;

public class Info {
    private String name;
    private int age;
    private String hobby;

    private String job;
    private int pay;

    public Info(String name, int age, String hobby, String job, int pay) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.job = job;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getJob() {
        return job;
    }

    public int getPay() {
        return pay;
    }
}
