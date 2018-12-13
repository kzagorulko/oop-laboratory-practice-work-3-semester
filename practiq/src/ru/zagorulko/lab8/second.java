package ru.zagorulko.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");

            Scanner scanner = new Scanner(new FileInputStream(file));

            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
            System.out.println(e.toString());
        }
    }
}
