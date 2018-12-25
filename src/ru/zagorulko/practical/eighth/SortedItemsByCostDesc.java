package ru.zagorulko.practical.eighth;

import java.util.Comparator;

public class SortedItemsByCostDesc implements Comparator<MenuItem> {

    @Override
    public int compare(MenuItem obj1, MenuItem obj2)
    {
        return obj2.getPrice() - obj1.getPrice();
    }

}
