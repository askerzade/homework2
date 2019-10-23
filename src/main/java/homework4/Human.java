package homework4;

public class Human {
    private String name;
    private String surname;
    private int birthDate;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    int[][] schedule;

    public Human() {

    }

    Human(String name, String surname, int birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, int birthDate, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
    }

    Human(String name, String surname, int birthDate, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
        this.iq = iq;
        this.pet = pet;
    }

    void greetPet() {
        System.out.printf("Привет,%s\n", pet.byName);
    }

    void describePet() {
        System.out.printf("У меня есть %s, ему %d лет, он %s.\n", pet.byName, pet.age, pet.trickLevel(pet.trickLevel));
    }

    public String toString() {
        return String.format("Human{name=%s, surname=%s year=%d, iq=%d, mother=%s %s,father=%s %s, pet={" + pet.toString() + "}}"
                , name, surname, birthDate, iq, mother.name, mother.surname, father.name, father.surname);
    }
    public String toStringParents() {
        return String.format("Human{name=%s, surname=%s year=%d}"
                , name, surname, birthDate);
    }
}
