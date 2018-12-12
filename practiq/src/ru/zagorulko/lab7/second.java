package ru.zagorulko.lab7;

import java.util.LinkedList;

public class second {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(2);
        list.addLast(5);
        list.addFirst(19);
        list.add(2, 0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }


}
