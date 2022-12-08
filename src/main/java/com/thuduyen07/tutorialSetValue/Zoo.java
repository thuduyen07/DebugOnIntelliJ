package com.thuduyen07.tutorialSetValue;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private ArrayList<Animal> animals = null;

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.getAnimal());
        System.out.println(zoo.getAnimal());
    }

    private ArrayList<Animal> getAnimal() {
        if (animals == null)
            initAnimal();
        return animals;
    }

    private void initAnimal() {
        animals = new ArrayList<>(Arrays.asList(
                new Animal("gaugau"),
                new Animal("meomeo"),
                new Animal("angang")
        ));
    }
}

class Animal {
    private String name;

    Animal(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

