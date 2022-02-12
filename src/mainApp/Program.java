package mainApp;

import agent.Human;

public class Program {
    public static void println(String input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        println("hello world");

        Human human = new Human("Thomas", 15);
        human.setJob("developer");
        human.Hello();

        println("Time passed...");
        human.BecomeOld();

        human.setJob("designer");
        human.Hello();
    }
}