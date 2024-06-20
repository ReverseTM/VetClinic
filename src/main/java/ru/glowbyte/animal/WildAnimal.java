package ru.glowbyte.animal;

import ru.glowbyte.interfaces.Animal;

public abstract class WildAnimal implements Animal {
    protected String name;

    protected String habitat;

    public WildAnimal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }
}
