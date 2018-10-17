package lab3.zagorulko;

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

    public Tableware(String name, String matrial, TablewareTyp typ) {
        super(name, matrial);
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
