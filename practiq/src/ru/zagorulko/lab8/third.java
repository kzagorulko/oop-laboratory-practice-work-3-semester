package ru.zagorulko.lab8;

import java.io.*;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(System.in, "utf-8");
            FileOutputStream writer = new FileOutputStream(file);

            String text = scanner.nextLine();
            writer.write(text.getBytes());
            writer.write('\n');

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
            System.out.println(e.toString());
        }
    }
}
