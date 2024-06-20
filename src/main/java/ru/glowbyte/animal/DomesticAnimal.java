package ru.glowbyte.animal;

import ru.glowbyte.interfaces.Animal;

import java.util.Objects;

public abstract class DomesticAnimal implements Animal {
    protected String name;

    protected String ownerName;

    protected DomesticAnimal(String name, String ownerName) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomesticAnimal that = (DomesticAnimal) o;
        return Objects.equals(name, that.name) && Objects.equals(ownerName, that.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ownerName);
    }
}
