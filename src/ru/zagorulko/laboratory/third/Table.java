package ru.zagorulko.laboratory.third;

/**
 * Created by liveuser on 18.10.18.
 */
public class Table extends Furniture {
    private int tableTopArea;

    public Table(String name, int tableTopArea) {
        super(name);
        this.tableTopArea = tableTopArea;
    }

    public Table(String name, int height, int tableTopArea) {
        super(name, height);
        this.tableTopArea = tableTopArea;
    }

    public Table(String name, int height, int weight, int tableTopArea) {
        super(name, height, weight);
        this.tableTopArea = tableTopArea;
    }

    public int getTableTopArea() {
        return tableTopArea;
    }

    public void setTableTopArea(int tableTopArea) {
        this.tableTopArea = tableTopArea;
    }
}
