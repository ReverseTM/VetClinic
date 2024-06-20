package ru.glowbyte.animal.wild;

import ru.glowbyte.animal.WildAnimal;

public class Fox extends WildAnimal {
    public Fox(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("Тяф");
    }
}
