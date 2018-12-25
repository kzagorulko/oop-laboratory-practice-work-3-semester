package ru.zagorulko.laboratory.first;

import java.util.Random;

/**
 * Created by liveuser on 06.09.18.
 */
public class MathDoWhile {
    public void show() {
        long N = 0, sum = 0;
        System.out.println("Сумма следующих чисел: ");
        do{
            N = Math.round(Math.random() * 10);
            System.out.println(N);
            sum+=N;
        }while(N != 0);

        System.out.println(">>>" + sum);
    }
}
