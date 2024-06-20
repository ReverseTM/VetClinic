package ru.glowbyte.service;

import ru.glowbyte.interfaces.Animal;

public class Veterinarian {
    public void treat(Animal animal) {
        System.out.println("Началось лечение животного с кличкой " + animal.getName());
        animal.makeNoise();
        System.out.println("Лечение закончено");
    }
}
