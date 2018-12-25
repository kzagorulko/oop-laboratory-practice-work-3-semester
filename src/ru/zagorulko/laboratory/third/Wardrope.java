package ru.zagorulko.laboratory.third;

/**
 * Created by liveuser on 18.10.18.
 */
public class Wardrope extends Furniture{
    private int volume;

    public Wardrope(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    public Wardrope(String name, int height, int volume) {
        super(name, height);
        this.volume = volume;
    }

    public Wardrope(String name, int height, int weight, int volume) {
        super(name, height, weight);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
