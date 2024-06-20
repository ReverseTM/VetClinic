package ru.glowbyte;

import ru.glowbyte.animal.domestic.Cat;
import ru.glowbyte.animal.domestic.Dog;
import ru.glowbyte.animal.wild.Fox;
import ru.glowbyte.animal.wild.Wolf;
import ru.glowbyte.interfaces.Animal;
import ru.glowbyte.service.Veterinarian;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();

        List<Animal> animals = List.of(
                new Cat("Барсик", "Петя"),
                new Fox("Алиса", "Лес"),
                new Dog("Шарик", "Иван"),
                new Wolf("Клык", "Лес")
        );

        animals.forEach(veterinarian::treat);
    }
}