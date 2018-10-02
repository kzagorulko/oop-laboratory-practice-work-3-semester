package ru.zag.lab1;

/**
 * Created by liveuser on 06.09.18.
 */
public class Factorial {
    long res = 1;
    public long factorial(int N) {
        for(int i = 1; i <= N; i++)
            res*=i;
        return res;
    }

    public long rec_factorial(int N) {
        if(N > 1) {
            res *= N;
            rec_factorial(--N);
        }
        return res;
    }
}
