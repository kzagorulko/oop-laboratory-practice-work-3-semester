package ru.zagorulko.laboratory.fifth;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        setColor(color);
        setX(x);
        setY(y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + getColor() +
                ", x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                '}';
    }
}
