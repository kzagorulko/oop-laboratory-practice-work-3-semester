package ru.zagorulko.practical.eighth;

public class List2 {

    private Node2 head;
    private Node2 current;
    private int size;



    public List2() {
        this.head = null;
        this.current = null;
        this.size = 0;
    }

    public boolean add(MenuItem a){
        return true;
    }

    public boolean add(Order a){

        Node2 tmp = new Node2(this.current, null,  a);

        if(this.head == null) {
            this.head = tmp;
        }

        //System.out.println(a.costTotal());

        if(this.current != null) {
            this.current.setPrev(tmp);
        }

        this.current = tmp;

        this.size++;

        return true;

    }

    public void next(){
        this.current = this.current.getNext();
    }

    public void prev(){
        this.current = this.current.getPrev();
    }



    public Order showValue(){
        return this.current.getValue();
    }



    public Node2 getHead() {
        return head;
    }

    public Node2 getCurrent() {
        return current;
    }

    public int getSize() {
        return size;
    }

    public void setCurrent(Node2 current) {
        this.current = current;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public boolean remove(Order order){

        boolean flag = false;

        this.current = this.head;

        while(this.current != null){

            if(this.current.getValue() == order){

                flag = true;

                Node2 next = this.current.getNext();
                Node2 prev = this.current.getPrev();

                if(prev == null){
                    prev = this.head;
                }

                prev.setNext(next);
                next.setPrev(prev);

                Node2 cur = this.current;
                this.current = this.head;
                cur = null;

                break;

            }

            next();
        }

        return flag;
    }



}

class Node2{

    private Node2 next;
    private Node2 prev;
    private Order value;

    public Node2(Node2 next, Node2 prev, Order value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Order getValue(){
        return this.value;
    }

    public Node2 getNext() {
        return this.next;
    }

    public Node2 getPrev() {
        return prev;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public void setPrev(Node2 prev) {
        this.prev = prev;
    }

    public void setValue(Order value) {
        this.value = value;
    }
}

