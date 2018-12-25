package ru.zagorulko.laboratory.third;

public class Tableware extends Dish{
    enum TablewareTyp {FORK, SPOON, KNIFE};
    private TablewareTyp typ;

    public Tableware(TablewareTyp typ) {
        super();
        this.typ = typ;
    }

    public Tableware(String name, TablewareTyp typ) {
        super(name);
        this.typ = typ;
    }

    public Tableware(String name, String material, TablewareTyp typ) {
        super(name, material);
        this.typ = typ;
    }

    public TablewareTyp getTyp() {
        return typ;
    }

    public void setTyp(TablewareTyp typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Tableware{" +
                "typ=" + typ +
                '}';
    }
}
