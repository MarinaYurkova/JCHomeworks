package ru.geekbrains.lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Tishe", "kot", "myshi", "na", "kryshe"};
        replaceArray(array, 1,2);

        shiftFruits();
    }

    private static void shiftFruits() {
        BoxFruit<Apple> boxApple = new BoxFruit<Apple>(1);
        BoxFruit<Orange> boxOrange = new BoxFruit<Orange>(1.5);
        BoxFruit<Apple> boxApple2 = new BoxFruit<Apple>(1);

        for (int i = 0; i < 3; i++) {
            boxOrange.addFruit(new Orange());
            boxApple.addFruit(new Apple());
            boxApple2.addFruit(new Apple());
        }

        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple2.addFruit(new Apple());

        System.out.println("\nWeight box with Apple: " + boxApple.getBoxWeight());
        System.out.println("Weight box with Orange: " + boxOrange.getBoxWeight());
        System.out.println("Weights equals - " + boxApple.compare(boxOrange));
        boxApple.addFruits(boxApple2);
    }

    public static void replaceArray(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        System.out.println(Arrays.toString(array));
    }
}
