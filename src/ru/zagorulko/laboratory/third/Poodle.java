package ru.zagorulko.laboratory.third;

/**
 * Created by liveuser on 18.10.18.
 */
public class Poodle extends Dog {
    private boolean bald;

    public Poodle(int numberOfLegs, int length, int growth, boolean bald) {
        super(numberOfLegs, length, growth);
        this.bald = bald;
    }

    public Poodle(String nickname, int numberOfLegs, int length, int growth, boolean bald) {
        super(nickname, numberOfLegs, length, growth);
        this.bald = bald;
    }

    public void setBald(boolean bald) {
        this.bald = bald;
    }

    public boolean isBald() {
        return bald;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Poodle{" +
                "bald=" + bald +
                '}';
    }
}
