package ru.glowbyte.animal;

import ru.glowbyte.interfaces.Animal;

public abstract class DomesticAnimal implements Animal {
    protected String name;

    protected String ownerName;

    public DomesticAnimal(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
