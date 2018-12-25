package ru.zagorulko.practical.eighth;

interface OrdersManager {

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders(MenuItem item);
    int ordersCostSummary();
    int ordersQuantity();

}
