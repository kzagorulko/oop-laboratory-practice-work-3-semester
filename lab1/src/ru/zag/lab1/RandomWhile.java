package ru.zag.lab1;

import java.util.Random;

/**
 * Created by liveuser on 06.09.18.
 */
public class RandomWhile {
    public void show(){
        Random rnd = new Random();
        int num = rnd.nextInt(10) + 1, sum = 0;
        System.out.println("Сумма следующих числе: ");
        while (num != 0) {
            sum+=num;
            System.out.println(num);
            num = rnd.nextInt(10);
        }
        System.out.println(">>>" + sum);
    }


}
