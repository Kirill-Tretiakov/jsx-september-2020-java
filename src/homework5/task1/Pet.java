package homework5.task1;

import java.util.Objects;

public class Pet {

    private Breed breed;
    private String name;

    public Pet() {
    }

    public Pet(Breed breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return breed == pet.breed && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                '}';
    }
}
