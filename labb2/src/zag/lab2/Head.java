package zag.lab2;

public class Head {
    double headLengthVertically, getHeadLengthHorizontally;
    String hairColor;

    public Head(double headLengthVertically, double getHeadLengthHorizontally, String hairColor) {
        this.headLengthVertically = headLengthVertically;
        this.getHeadLengthHorizontally = getHeadLengthHorizontally;
        this.hairColor = hairColor;
    }

    public double getHeadLengthVertically() {
        return headLengthVertically;
    }

    public void setHeadLengthVertically(double headLengthVertically) {
        this.headLengthVertically = headLengthVertically;
    }

    public double getGetHeadLengthHorizontally() {
        return getHeadLengthHorizontally;
    }

    public void setGetHeadLengthHorizontally(double getHeadLengthHorizontally) {
        this.getHeadLengthHorizontally = getHeadLengthHorizontally;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "headLengthVertically=" + headLengthVertically +
                ", getHeadLengthHorizontally=" + getHeadLengthHorizontally +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
