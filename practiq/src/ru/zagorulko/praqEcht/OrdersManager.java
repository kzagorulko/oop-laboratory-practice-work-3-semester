package ru.zagorulko.praqEcht;

interface OrdersManager {

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders(MenuItem item);
    int ordersCostSummary();
    int ordersQuantity();

}
