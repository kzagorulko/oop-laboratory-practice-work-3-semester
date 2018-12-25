package ru.zagorulko.laboratory.first;

/**
 * Created by liveuser on 06.09.18.
 */
public class HarmonicSeries {
    double sum = 0;
    public void show() {
        for(int i = 1; i < 11; i++){
            sum+= 1/(double)i;
        }
        System.out.println(">>>" + sum);
    }
}
