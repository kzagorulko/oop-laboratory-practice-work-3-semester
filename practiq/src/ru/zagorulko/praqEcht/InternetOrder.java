package ru.zagorulko.praqEcht;
import java.util.Arrays;

public class InternetOrder extends List implements Order{

    private Customer customer;

    public InternetOrder() {
        super();
        this.customer = null;
    }





    @Override
    public String[] itemsNames() {

        String[] itemsNames = new String[20];

        this.setCurrent(this.getHead());

        Node cur = this.getCurrent();

        int i = 0;

        while(this.getCurrent() != null) {
            itemsNames[i] = this.getCurrent().getValue().getName();
            this.next();
            i++;
        }

        this.setCurrent(cur);

        return itemsNames;
    }

    @Override
    public int itemsQuantity() {
        return this.getSize();
    }

    /* ---- */
    @Override
    public int itemQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return 0;
    }

    /* !--- */


    @Override
    public MenuItem[] getItems() {

        MenuItem[] items = new MenuItem[20];

        this.setCurrent(this.getHead());

        Node cur = this.getCurrent();

        int i = 0;

        while(this.getCurrent() != null) {
            items[i] = this.getCurrent().getValue();
            this.next();
            i++;
        }

        this.setCurrent(cur);

        return items;
    }

    @Override
    public boolean remove(String itemName) {

        boolean flag = false;
        int size = this.getSize();

        this.setCurrent(this.getHead());

        for(int i = 0; i < size; i++){

            if((this.getCurrent().getValue().getName()).equals(itemName)){
                flag = true;
                this.setSize(this.getSize() - 1);
                continue;
            }

            if(flag){
                this.setCurrent(this.getCurrent().getNext());
            }

            next();

        }

        return flag;

    }

    @Override
    public boolean remove(MenuItem item) {

        this.remove(item);

        return true;

        /*
        boolean flag = false;
        int size = this.getSize();

        this.setCurrent(this.getHead());

        for(int i = 0; i < size; i++){

            if((this.getCurrent().getValue()) == item){
                flag = true;
                this.setSize(this.getSize() - 1);
                continue;
            }

            if(flag){
                this.setCurrent(this.getCurrent().getNext());
            }

            next();

        }

        return flag;
        */
    }



    /* --- */
    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return 0;
    }

    /* !--- */

    @Override
    public MenuItem[] sortedItemsByCostDesc() {

        MenuItem[] items = new MenuItem[20];

        this.setCurrent(this.getHead());
        Node cur = this.getCurrent();

        int i = 0;

        while(this.getCurrent() != null) {
            items[i] = (MenuItem) this.getCurrent().getValue();
            this.next();
            i++;
        }

        this.setCurrent(cur);

        Arrays.sort(items, (new SortedItemsByCostDesc()));

        return items;

    }

    @Override
    public int costTotal() {

        int total = 0;
        this.setCurrent(this.getHead());
        Node cur = this.getCurrent();

        for(int i = 0; i < this.getSize(); i++){

            if(this.getCurrent() != null) {
                total += this.getCurrent().getValue().getPrice();
                this.next();
            }

        }

        this.setCurrent(cur);

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

}
