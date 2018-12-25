package ru.zagorulko.practical.third;

/**
 * Created by liveuser on 10.10.18.
 */
public class MovableRectagle implements  Movable{
    private MovablePoint TopLeft;
    private MovablePoint BottomRight;

    public MovableRectagle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        TopLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        BottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectagle{" +
                "TopLeft=" + TopLeft +
                ", BottomRight=" + BottomRight +
                '}';
    }

    public void moveUp() {
        TopLeft.moveUp();
        BottomRight.moveUp();
    }

    public void moveLeft() {
        TopLeft.moveLeft();
        BottomRight.moveLeft();
    }

    public void moveDown() {
        TopLeft.moveDown();
        BottomRight.moveDown();
    }

    public void moveRight() {
        TopLeft.moveRight();
        BottomRight.moveRight();
    }
}
