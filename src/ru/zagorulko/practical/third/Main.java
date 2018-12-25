package ru.zagorulko.practical.third;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(circle.toString());
        circle.moveRight();
        System.out.println(circle.toString());
        MovableRectagle rectangle = new MovableRectagle(1, 22, 3, 11, 3, 2);
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
