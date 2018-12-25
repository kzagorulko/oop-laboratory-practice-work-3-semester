package ru.zagorulko.laboratory.third;

/**
 * Created by liveuser on 18.10.18.
 */
public abstract class Furniture {
    private int weight, height;
    private String name;

    public Furniture(String name) {
        this.name = name;
    }

    public Furniture(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Furniture(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
