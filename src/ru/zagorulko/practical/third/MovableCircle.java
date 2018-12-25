package ru.zagorulko.practical.third;

/**
 * Created by liveuser on 10.10.18.
 */
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveDown() {
        center.y-=center.ySpeed;
    }

    public void moveUp() {
        center.y+=center.ySpeed;
    }

    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    public void moveRight() {
        center.x+=center.xSpeed;
    }


}
