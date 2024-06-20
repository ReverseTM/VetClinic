package ru.glowbyte.animal.domestic;

import ru.glowbyte.animal.DomesticAnimal;

public class Dog extends DomesticAnimal {
    public Dog(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гаф");
    }
}
