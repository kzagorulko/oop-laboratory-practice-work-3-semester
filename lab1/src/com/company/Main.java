package com.company;
import ru.zag.lab1.*;

public class Main {

    public static void main(String[] args) {
        ScannerFor sf = new ScannerFor();
        RandomWhile rw = new RandomWhile();
        MathDoWhile mdw = new MathDoWhile();
        Arguments ar = new Arguments();
        HarmonicSeries hs = new HarmonicSeries();
        RandomNums rn = new RandomNums(10);
        Factorial factorial = new Factorial();
        System.out.println(">>>" + factorial.rec_factorial(3));
        hs.show();
    }
}
