package point_and_moveablepoint;

public class MovablPointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5,6);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);
    }
}
