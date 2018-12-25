package ru.zagorulko.practical.eighth;

//import com.sun.org.apache.xpath.internal.operations.String;

public final class Drink extends MenuItem implements Alcoholable{

    private double alcoholVol;
    private DrinkTypeEnum type;


    public Drink(String name, String desk, int cost) {
        super(name, desk, cost);
    }

    public Drink(String name, String desk, int cost, DrinkTypeEnum type) {
        super(name,desk,cost);
        this.type = type;
    }

    public Drink(String name, String desk) {
        super(name,desk);
    }



    public DrinkTypeEnum getType(){
        return this.type;
    }

    @Override
    public boolean isAlcoholDrink() {
        return Boolean.valueOf(String.valueOf(this.alcoholVol))?false:true;
    }

    @Override
    public double getAlcoholVol() {
        return this.alcoholVol;
    }
}
