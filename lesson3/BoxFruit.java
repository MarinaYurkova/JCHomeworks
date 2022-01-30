package ru.geekbrains.lesson3;

import java.util.ArrayList;

public class BoxFruit<F> {

    private double weightFruit = 0.0;
    ArrayList<F> fruits = new ArrayList();

    public <F> BoxFruit(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(BoxFruit<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(BoxFruit<F> boxFruit){
        System.out.println("\nIn box1: " + fruits.size() + " fruits");
        System.out.println("In box2: " + boxFruit.fruits.size() + " fruits");
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("Added fruits in boxes...And now");
        System.out.println("In box1: " + fruits.size() + " fruits");
        System.out.println("In box2: " + boxFruit.fruits.size() + " fruits");
    }
}