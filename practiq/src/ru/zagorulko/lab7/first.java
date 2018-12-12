package ru.zagorulko.lab7;

import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();;
        list1.add(8);
        list1.add(9);
        list1.add(4);
        list.add(0, 0);
        list.add(1,1);

        list.addAll(2, list1);


        list.add(-1);

        System.out.println(list);
        System.out.println(2 + " : " + list.get(2) + "\nlast index -1: " + list.lastIndexOf(-1));
        list.remove(4);
        System.out.println(list);

    }
}
