package ru.zagorulko.laboratory.fourth;

public class Main {

    public static void main(String[] args) {
        Man jora = new Man("Жора");
        System.out.println(jora.getName());
        Cat boris = new Cat("Борис");
        System.out.println(boris.getName());
        Bottle coneforest = new Bottle(24);
        System.out.println(coneforest.getPrice());
        Table table = new Table(5000);
        System.out.println(table.getPrice());
    }
}
