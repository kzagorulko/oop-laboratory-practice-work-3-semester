package zag.lab2;

public class Hand {
    double fingersLength, length;
    boolean armBroken;

    public Hand(double fingersLength, double length) {
        this.fingersLength = fingersLength;
        this.length = length;
        this.armBroken = false;
    }

    public Hand(double fingersLength, double length, boolean armBroken) {
        this.fingersLength = fingersLength;
        this.length = length;
        this.armBroken = armBroken;
    }

    public double getFingersLength() {
        return fingersLength;
    }

    public void setFingersLength(double fingersLength) {
        this.fingersLength = fingersLength;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setArmBroken(boolean armBroken) {
        this.armBroken = armBroken;
    }

    public boolean isArmBroken() {
        return this.armBroken;
    }
}
