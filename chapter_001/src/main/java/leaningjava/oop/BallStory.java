package leaningjava.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        GreyWolf greyWolf = new GreyWolf();

        hare.tryEat(ball);
        fox.tryEat(ball);
        greyWolf.tryEat(ball);
    }
}
