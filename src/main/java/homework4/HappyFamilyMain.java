package homework4;

public class HappyFamilyMain {
    public static void main(String[] args) {
        familyMamedov();
        familyQuliyev();
    }

    private static void familyMamedov() {
        Human male = new Human("Искандер", "Мамедов", 1984);
        Human female = new Human("Leyla", "Мамедов", 1988);
        Pet pet = new Pet("Dog", "Рекс", 6, 75, new String[]{"eat, ", "sleep, ", "walk, ", "play"});
        Human kid = new Human("Вагиф", "Мамедов", 2009, 95, pet, female, male);
        kid.describePet();
        kid.greetPet();
        pet.respond();
        pet.eat();
        pet.foul();
        System.out.println(male.toStringParents());
        System.out.println(female.toStringParents());
        System.out.println(kid.toString());
        System.out.println(pet.toString());

    }

    public static void familyQuliyev() {
        Human male = new Human("Али", "Гулиев", 1986);
        Human female = new Human("Инара", "Гулиева", 1990);
        Pet pet = new Pet("Cat", "Квентин", 1, 43, new String[]{"eat, ", "sleep, ", "poo, ", "destroy everything"});
        Human kid = new Human("Айдан", "Гулиева", 2013, 90, pet, female, male);
        kid.describePet();
        kid.greetPet();
        pet.respond();
        pet.eat();
        pet.foul();
        System.out.println(male.toStringParents());
        System.out.println(female.toStringParents());
        System.out.println(kid.toString());
        System.out.println(pet.toString());
    }
}
