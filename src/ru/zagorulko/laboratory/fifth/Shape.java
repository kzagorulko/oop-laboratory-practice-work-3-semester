package ru.zagorulko.laboratory.fifth;

import java.awt.*;

public abstract class Shape {
    private int x, y;
    private Color color;

    void setX(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
