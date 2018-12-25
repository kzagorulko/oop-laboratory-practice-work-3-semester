package ru.zagorulko.practical.eighth;

import java.util.Arrays;

public class TableOrder implements Order {


    private int size;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder() {
        this.size = 0;
        this.items = new MenuItem[20];
        this.customer = null;
    }

    public TableOrder(MenuItem[] items) {
        this.items = items;
    }


    public int getSize(){
        return this.size;
    }

    @Override
    public boolean add(MenuItem item) {

        if(size < 20) {
            this.items[size] = item;
            size++;

            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean add(Order item) {
        return true;
    }

    @Override
    public String[] itemsNames() {

        String[] itemsNames = new String[this.size];

        for(int i = 0; i < this.size; i++) {
            itemsNames[i] = this.items[i].getName();
        }

        return itemsNames;
    }

    @Override
    public int itemsQuantity() {
        return this.size;
    }

    /* ---- */
    @Override
    public int itemQuantity(String itemName) {

        for(int i = 0; i < this.size; i++){
            if((items[i].getName()).equals(itemName)){
                return items[i].getPrice();
            }
        }

        return 0;

    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return 0;
    }

    /* !--- */

    @Override
    public MenuItem[] getItems() {
        return this.items;
    }

    @Override
    public boolean remove(String itemName) {

        boolean flag = false;

        int size = this.size;

        for(int i = 0; i < size; i++){

            if((items[i].getName()).equals(itemName)){
                flag = true;
                this.size--;
                continue;
            }

            if(flag){
                this.items[i-1] = this.items[i];
                this.items[i] = null;
            }

        }

        return flag;

    }

    @Override
    public boolean remove(MenuItem item) {

        boolean flag = false;
        int size = this.size;

        for(int i = 0; i < size; i++){

            if(items[i] == item){
                flag = true;
                this.size--;
                continue;
            }

            if(flag){
                this.items[i-1] = this.items[i];
                this.items[i] = null;
            }

        }

        return flag;
    }



    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {

        int size = this.size;

        for(int i = 0; i < size; i++){
            this.items[i] = null;
        }


        return size;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {

        MenuItem[] items = this.items;

        Arrays.sort(items, (new SortedItemsByCostDesc()));

        return items;

    }

    @Override
    public int costTotal() {

        int total = 0;

        for(int i = 0; i < this.size; i++){
            total += this.items[i].getPrice();
        }

        return total;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString(){

        String str = "";

        for(int i = 0; i < this.items.length; i++){
            str += this.items[i].getName()+"\n";
        }

        return str;
    }
}
