package zag.lab2;

public class BookTest {
    public static void main(String[] args) {
        Book book0 = new Book(213);
        System.out.println(book0);

        Book book1 = new Book("Johann Wolfgang von Goethe", "Faust", 340);
        System.out.println(book1);

        Book book2 = new Book("William Shakespeare", "Richard III", 1633, 240);
        System.out.println(book2);

        Book book3 = new Book("Plato", "Republic","AST", -360, 540);
        System.out.println(book3);


    }
}
