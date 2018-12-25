package ru.zagorulko.practical.eighth;

public class InternetOrdersManager extends List2 implements OrdersManager {

    public InternetOrdersManager() {
        super();
    }


    public Order remove(){
        this.remove(this.getCurrent().getValue());
        return this.getCurrent().getValue();
    }

    public Order order(){
        return this.getCurrent().getValue();
    }


    /* --- */
    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }
    /* !--- */


    @Override
    public Order[] getOrders(MenuItem item) {

        Order[] orders = new Order[this.getSize()];

        this.setCurrent(this.getHead());

        Node2 cur = this.getCurrent();

        for(int i = 0; i < this.getSize(); i++){
            orders[i] = this.getCurrent().getValue();
            next();
        }

        this.setCurrent(cur);

        return orders;
    }

    @Override
    public int ordersCostSummary() {

        int sum = 0;

        this.setCurrent(this.getHead());

        Node2 cur = this.getCurrent();

        for(int i = 0; i < this.getSize(); i++){
            if(this.getCurrent() != null) {
                sum += this.getCurrent().getValue().costTotal();
                next();
            }
        }

        this.setCurrent(cur);

        return sum;
    }

    @Override
    public int ordersQuantity() {
        return this.getSize();
    }
}
