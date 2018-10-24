package lab3.zagorulko;

/**
 * Created by liveuser on 18.10.18.
 */
public abstract class Dog {
    private String nickname;
    private int numberOfLegs, length, growth;

    public Dog(int numberOfLegs, int length, int growth) {
        this.numberOfLegs = numberOfLegs;
        this.length = length;
        this.growth = growth;
        this.nickname = "Unknown";
    }

    public Dog(String nickname, int numberOfLegs, int length, int growth) {
        this.nickname = nickname;
        this.numberOfLegs = numberOfLegs;
        this.length = length;
        this.growth = growth;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "calltag='" + nickname + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", lnegth=" + length +
                ", growth=" + growth +
                '}';
    }
}


