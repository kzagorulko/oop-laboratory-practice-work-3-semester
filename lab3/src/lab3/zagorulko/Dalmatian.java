package lab3.zagorulko;

/**
 * Created by liveuser on 18.10.18.
 */
public class Dalmatian extends Dog{
    private int numberOfStained;

    public Dalmatian(int numberOfLegs, int length, int growth, int numberOfStained) {
        super(numberOfLegs, length, growth);
        this.numberOfStained = numberOfStained;
    }

    public Dalmatian(String nickname, int numberOfLegs, int length, int growth, int numberOfStained) {
        super(nickname, numberOfLegs, length, growth);
        this.numberOfStained = numberOfStained;
    }

    public int getNumberOfStained() {
        return numberOfStained;
    }

    public void setNumberOfStained(int numberOfStained) {
        this.numberOfStained = numberOfStained;
    }

    @Override
    public String toString() {
        return super.toString() + "Dalmatian{" +
                "numberOfStained=" + numberOfStained +
                '}';
    }
}
