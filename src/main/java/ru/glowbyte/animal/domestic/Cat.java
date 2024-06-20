package ru.glowbyte.animal.domestic;

import ru.glowbyte.animal.DomesticAnimal;

public class Cat extends DomesticAnimal {
    public Cat(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
}
