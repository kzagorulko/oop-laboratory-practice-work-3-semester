package lab3.zagorulko;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(3,4,200,240);
        shop.soldTable();
        shop.deliveryTable();
        shop.deliveyWardropes();
        shop.deliveyWardropes();
        shop.soldTable();
        shop.soldWardope();
    }
}
