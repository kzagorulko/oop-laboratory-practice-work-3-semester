package ru.zagorulko.practical.third;

/**
 * Created by liveuser on 10.10.18.
 */
public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveDown() {
        y-=ySpeed;
    }

    public void moveUp() {
        y+=ySpeed;
    }

    public void moveLeft() {
        x-=xSpeed;
    }

    public void moveRight() {
        x+=xSpeed;
    }
}
