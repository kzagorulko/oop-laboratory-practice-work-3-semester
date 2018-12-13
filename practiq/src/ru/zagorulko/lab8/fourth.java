package ru.zagorulko.lab8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in, "utf-8");
            Files.write(
                    Paths.get("file.txt"),
                    scanner.nextLine().getBytes(),
                    StandardOpenOption.APPEND
            );
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
            System.out.println(e.toString());
        }
    }
}
