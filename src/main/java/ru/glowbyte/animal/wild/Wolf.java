package ru.glowbyte.animal.wild;

import ru.glowbyte.animal.WildAnimal;

public class Wolf extends WildAnimal {
    public Wolf(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("Аууу");
    }
}
