package lab3.zagorulko;

/**
 * Created by liveuser on 18.10.18.
 */
public class FurnitureShop {
    private Table[] tables;
    private Wardrope[] wardropes;
    private int priseForTable, getPriseForWardrope;

    public FurnitureShop(int numberOfTables, int numberOfWardropes, int priseForTable, int priseForWardrope) {
        tables    = new Table[numberOfTables];
        wardropes = new Wardrope[numberOfWardropes];
        for(int i = 0; i < tables.length; i++) {
            tables[i] = new Table("office Desk", 90, 20, 2);
        }
        for(int i = 0; i < wardropes.length; i++) {
            wardropes[i] = new Wardrope("Office Cabinet", 200, 30, 2);
        }
        this.priseForTable = priseForTable;
        this.getPriseForWardrope = priseForWardrope;
    }

    public int getPriseForTable() {
        return priseForTable;
    }

    public void setPriseForTable(int priseForTable) {
        this.priseForTable = priseForTable;
    }

    public int getGetPriseForWardrope() {
        return getPriseForWardrope;
    }

    public void setGetPriseForWardrope(int getPriseForWardrope) {
        this.getPriseForWardrope = getPriseForWardrope;
    }

    public Table[] getTables() {
        return tables;
    }

    public void setTables(Table[] tables) {
        this.tables = tables;
    }

    public Wardrope[] getWardropes() {
        return wardropes;
    }

    public void setWardropes(Wardrope[] wardropes) {
        this.wardropes = wardropes;
    }


    //= new Table[10];
    //("office Desk", 90, 20, 2);

}
