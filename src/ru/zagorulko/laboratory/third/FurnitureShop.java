package ru.zagorulko.laboratory.third;

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

    public void soldTable() {
        if(tables.length > 0) {
            tables = new Table[tables.length-1];
            for(int i = 0; i < tables.length; i++) {
                tables[i] = new Table("office Desk", 90, 20, 2);
            }
            System.out.println("Стол продан! Количество столов - " + tables.length);
        }else {
            System.out.println("Столов в наличие нет!");
        }
    }

    public  void soldWardope() {
        if(wardropes.length > 0) {
            wardropes = new Wardrope[wardropes.length-1];
            for(int i = 0; i < wardropes.length; i++) {
                wardropes[i] = new Wardrope("oOffice Cabinet", 200, 20, 2);
            }
            System.out.println("Шкаф продан! Количество шкафов - " + wardropes.length);
        }else {
            System.out.println("Шкафов в наличие нет!");
        }
    }

    public void  deliveryTable() {
        tables = new Table[tables.length+1];
        for(int i = 0; i < tables.length; i++) {
            tables[i] = new Table("office Desk", 90, 20, 2);
        }
        System.out.println("Стол доставлен. Столов на складе: " + tables.length);
    }

    public void deliveyWardropes() {
        wardropes = new Wardrope[wardropes.length + 1];
        for(int i = 0; i < wardropes.length; i++) {
            wardropes[i] = new Wardrope("office Desk", 200, 20, 2);
        }
        System.out.println("Шкаф доставлен. Шкафов на складе: " + wardropes.length);
    }

}
