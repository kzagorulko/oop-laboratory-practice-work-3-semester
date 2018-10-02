package ru.zag.lab1;

import java.util.Scanner;

/**
 * Created by liveuser on 06.09.18.
 */
public class ScannerFor {
    public void show(){
        Scanner sc = new Scanner(System.in);
        int N, sum = 0;
        System.out.println("Введите сколько чисел будет в массиве");
        N = sc.nextInt();
        int[] mas = new int[N];
        for(int i = 0; i < N; i++) {
            mas[i] = sc.nextInt();
            sum+=mas[i];
        }
        System.out.println(">>>" + sum);
        System.out.println('\n');
    }
}
