package ru.zagorulko.praqEcht;

public interface OrderManager {
    public int itemsQuantity(String itemName);
    //public int itemsQuantity(MenuItem item);
    //public Order[] getOrders(MenuItem item);
    public int ordersCostSummary();
    public int ordersQuantity();
}
