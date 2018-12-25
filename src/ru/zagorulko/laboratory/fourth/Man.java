package ru.zagorulko.laboratory.fourth;

/**
 * Created by liveuser on 01.11.18.
 */
public class Man implements Nameable{
    String name;

    public Man(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
       return name;
    }
}
