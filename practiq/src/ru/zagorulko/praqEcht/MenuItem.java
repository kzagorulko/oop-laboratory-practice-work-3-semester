package ru.zagorulko.praqEcht;

public class MenuItem implements Item{

    private String name;
    private String desk;
    private int cost;

    public MenuItem(String name, String desk, int cost) {
        this.name = name;
        this.desk = desk;
        this.cost = cost;
    }

    public MenuItem(String name, String desk) {
        this.name = name;
        this.desk = desk;
        this.cost = 0;
    }


    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desk;
    }

}
