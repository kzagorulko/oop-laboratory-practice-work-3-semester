package ru.zagorulko.practical.first;

class Tests {
    public static void main(String[] args) {
        testBookInit();
        testBookToStringg();

        testBallInit();
        testBallToStringg();

        System.out.println("OK");
    }

    private static void doAssert(boolean condition) {
        if (!condition)
            throw new AssertionError("Assertion is wrong!");
    }

    private static void testBookInit() {
        Book book = new Book("Cool book", 10);

        doAssert(book.getTitle().equals("Cool book"));
        doAssert(book.getPages() == 10);
    }

    private static void testBookToStringg() {
        Book book = new Book("Cool book", 10);

        doAssert(book.toString().equals("Book \"Cool book\" with 10 pages."));
    }

    private static void testBallInit() {
        Ball ball = new Ball(60);

        doAssert(ball.getRadius() == 60);
    }

    private static void testBallToStringg() {
        Ball ball = new Ball(60);

        doAssert(ball.toString().equals("Ball with radius 60.000000."));
    }
}