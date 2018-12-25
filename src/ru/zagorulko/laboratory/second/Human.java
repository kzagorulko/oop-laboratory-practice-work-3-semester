package ru.zagorulko.laboratory.second;

public class Human {
    Hand hands;// = new Hand(8,60);
    Head head;//  = new Head(20, 30, "Black");
    Leg legs;//   = new Leg(100, 40, "Greek");
    String race;
    double growth;
    int age;

    public Human(Hand hands, Head head, Leg legs, String race, double growth, int age) {
        this.hands = hands;
        this.head = head;
        this.legs = legs;
        this.race = race;
        this.growth = growth;
        this.age = age;
    }

    public Hand getHands() {
        return hands;
    }

    public void setHands(Hand hands) {
        this.hands = hands;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLegs() {
        return legs;
    }

    public void setLegs(Leg legs) {
        this.legs = legs;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
