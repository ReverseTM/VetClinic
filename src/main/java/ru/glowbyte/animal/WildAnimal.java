package ru.glowbyte.animal;

import ru.glowbyte.interfaces.Animal;

import java.util.Objects;

public abstract class WildAnimal implements Animal {
    protected String name;

    protected String habitat;

    protected WildAnimal(String name, String habitat) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WildAnimal that = (WildAnimal) o;
        return Objects.equals(name, that.name) && Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, habitat);
    }
}
