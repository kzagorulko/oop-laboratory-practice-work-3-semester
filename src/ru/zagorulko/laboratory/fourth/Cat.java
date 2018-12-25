package ru.zagorulko.laboratory.fourth;

/**
 * Created by liveuser on 01.11.18.
 */
public class Cat implements Nameable {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
