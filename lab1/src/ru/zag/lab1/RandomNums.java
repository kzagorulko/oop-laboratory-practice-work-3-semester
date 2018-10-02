package ru.zag.lab1;
import java.util.Random;
import java.util.Arrays;

/**
 * Created by liveuser on 06.09.18.
 */
public class RandomNums {
    int[] array;
    Random random = new Random();

    public RandomNums() {
        array = new int[10];
        generate();
    }

    public RandomNums(int length) {
        array = new int[length];
        generate();
    }

    private void generate() {
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        show();
        System.out.print("\n");
        show();
    }

    private void show() {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array);
    }




}