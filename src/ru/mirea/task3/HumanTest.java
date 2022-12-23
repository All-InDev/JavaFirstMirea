package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.setEyesColor("brown");
        human.setHeadSize(40.0);
        human.setHandsLength(35.0);
        human.setLegsLength(75.0);

        System.out.println(human);
    }
}
