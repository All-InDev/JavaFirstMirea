package ru.mirea.task3;

public class Human {
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private Head head;

    public Human() {
        leftHand = new Hand("left");
        rightHand = new Hand("right");
        leftLeg = new Leg("left");
        rightLeg = new Leg("right");
        head = new Head();
    }

    public void setHandsLength(double length) {
        leftHand.setLength(length);
        rightHand.setLength(length);
    }

    public void setLegsLength(double length) {
        leftLeg.setLength(length);
        rightLeg.setLength(length);
    }

    public void setHeadSize(double size) {
        head.setSize(size);
    }

    public void setEyesColor(String color) {
        head.setEyesColor(color);
    }

    @Override
    public String toString() {
        return "Human { " +
                "left hand: " + leftHand +
                ",\n right hand: " + rightHand +
                ",\n left leg: " + leftLeg +
                ",\n right leg: " + rightLeg +
                ",\n head: " + head +
                '}';
    }
}
