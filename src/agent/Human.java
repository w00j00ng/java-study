package agent;


public class Human {
    private int age;
    private final String name;
    private String job;

    public Human(String name, Integer age) {
        this.age = age;
        this.name = name;
        this.job = "";
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void Hello() {
        System.out.printf("Hello, it is %s.\n", this.name);
        System.out.printf("I am %d years old.\n", this.age);
        if (!this.job.equals("")) {
            System.out.printf("I am working as a %s.\n", this.job);
        }
    }

    public void BecomeOld() {
        this.age++;
    }
}