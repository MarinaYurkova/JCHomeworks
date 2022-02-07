package ru.geekbrains.lesson5;

import java.util.Arrays;

public class ReadFile {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("homework5.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToFile("writehomework5.csv");
    }
}