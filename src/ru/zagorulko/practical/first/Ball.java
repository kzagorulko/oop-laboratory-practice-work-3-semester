package ru.zagorulko.practical.first;

class Ball {
    private float radius;

    public Ball(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Ball with radius %f.", radius);
    }
}
