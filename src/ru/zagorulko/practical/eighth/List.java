package ru.zagorulko.practical.eighth;

public class List {

    private Node head;
    private Node current;
    private int size;



    public List() {
        this.head = null;
        this.current = null;
        this.size = 0;
    }


    public boolean add(Order a){
        return true;
    }

    public boolean add(MenuItem a){

        Node tmp = new Node(this.current, a);


        //if(this.head == null) {
            this.head = tmp;
        //}

        this.current = tmp;

        this.size++;

        return true;

    }

    public void next(){
        this.current = this.current.getNext();
    }



    public MenuItem showValue(){
        return this.current.getValue();
    }



    public Node getHead() {
        return head;
    }

    public Node getCurrent() {
        return current;
    }

    public int getSize() {
        return size;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public boolean remove(MenuItem item){

        boolean flag = false;

        this.current = this.head;
        Node last = null;

        while(this.current != null){

            if(this.current.getValue() == item){

                flag = true;

                Node next = this.current.getNext();

                if(last == null) {
                    last = this.head;
                }

                last.setNext(next);


                Node cur = this.current;
                this.current = this.head;
                cur = null;

                break;

            }

            last = this.current;

            next();
        }

        return flag;
    }
}

class Node{

    private Node next;
    private MenuItem value;

    public Node(Node next, MenuItem value) {
        this.next = next;
        this.value = value;
    }

    public MenuItem getValue(){
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

