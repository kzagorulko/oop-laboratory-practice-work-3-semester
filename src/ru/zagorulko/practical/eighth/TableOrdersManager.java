package ru.zagorulko.practical.eighth;
import java.util.HashMap;
import java.util.Map;


public class TableOrdersManager implements OrdersManager {

    private Order[] orders;
    private Map<Integer, Order> tableNumbers = new HashMap<Integer, Order>();
    private int size;


    public TableOrdersManager() {
        this.orders = new Order[20];
        this.size = 0;
    }

    public void add(Order order, int tableNumber){
        if(this.size < 20){
            orders[this.size] = order;
            tableNumbers.put(tableNumber, orders[this.size]);
            this.size++;
        }
    }

    public void addItem(MenuItem item, int tableNumber){
        if(orders.length < 20){

            MenuItem[] items = new MenuItem[1];

            items[0] = item;

            orders[orders.length] = new TableOrder(items);
            tableNumbers.put(tableNumber, orders[orders.length]);

        }
    }

    // Следующие две функции предназначены для нахождения свободных ключей,
    // которые остаются после удаления по значению

    public int freeTableNumber(){
        int key = -1;

        for(int i = 0; i < this.orders.length; i++){

            if(this.tableNumbers.get(i) == null){
                key = i;
                break;
            }

        }

        return key;
    }

    public int[] freeTableNumbers(){

        int[] mass = new int[0];
        int k = 0;

        for(int i = 0; i < this.orders.length; i++){

            if(this.tableNumbers.get(i) == null){
                mass = new int[k+1];
                mass[k] = i;
                k++;

            }

        }

        return mass;
    }

    public Order getOrder(int tableNumber){
        return this.tableNumbers.get(tableNumber);
    }

    public void remove(int tableNumber){

        Order order = this.tableNumbers.get(tableNumber);
        boolean flag = false;
        int size = this.orders.length;

        for(int i = 0; i < size; i++) {

            if(this.orders[i] == order){
                flag = true;
                continue;
            }

            if(flag){
                this.orders[i-1] = this.orders[i];
                this.orders[i] = null;
            }
        }

        this.tableNumbers.remove(tableNumber);

    }

    public int remove(Order order){

        // Остаются свободные ключи

        boolean flag = false;
        int size = this.orders.length;

        for(int i = 0; i < size; i++) {

            if(this.orders[i] == order){
                flag = true;
                continue;
            }

            if(flag){
                this.orders[i-1] = this.orders[i];
                this.orders[i] = null;
            }
        }

        return 0;

    }

    public int removeAll(){

        int size = this.orders.length;

        for (int i = 0; i < size; i++) {
            this.orders[i] = null;
        }

        return size;
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

    @Override
    public Order[] getOrders(MenuItem item) {
        return new Order[0];
    }
    /* !--- */


    // Цена заказов
    @Override
    public int ordersCostSummary() {

        int sum = 0;

        for(int i = 0; i < this.orders.length; i++){

            if(this.orders[i] != null){
                sum += this.orders[i].costTotal();
            }
        }

        return sum;
    }

    // количество заказов
    @Override
    public int ordersQuantity() {
        return this.orders.length;
    }
}
