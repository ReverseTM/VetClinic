package ru.glowbyte;

import ru.glowbyte.animal.domestic.Cat;
import ru.glowbyte.animal.domestic.Dog;
import ru.glowbyte.animal.wild.Fox;
import ru.glowbyte.animal.wild.Wolf;
import ru.glowbyte.interfaces.Animal;
import ru.glowbyte.service.Veterinarian;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();

        Queue<Animal> queue = new ArrayDeque<>();
        queue.add(new Cat("Барсик", "Петя"));
        queue.add(new Fox("Алиса", "Лес"));
        queue.add(new Dog("Шарик", "Иван"));
        queue.add(new Wolf("Клык", "Лес"));

        Animal animal;
        while ((animal = queue.poll()) != null) {
            veterinarian.treat(animal);
        }
    }
}