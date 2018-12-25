package ru.zagorulko.laboratory.third;

public class Plate extends Dish {

    private int radius;

    public Plate(String name, String material) {
        super(name, material);
    }

    public Plate() {
        this.setName("Plate");
        this.setMaterial("Unknown");
    }

    public Plate(String name) {
        super(name);
    }

    public Plate(String material, int radius) {
        this.radius = radius;
        this.setMaterial(material);
        this.setName("Plate");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                '}';
    }
}
