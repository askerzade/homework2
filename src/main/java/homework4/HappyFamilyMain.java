package homework4;

public class HappyFamilyMain {
    public static void main(String[] args) {
        familyMamedov();
    }

    private static void familyMamedov() {
        Human male = new Human("Iskander", "Mamedov", 1984);
        Human female = new Human("Leyla", "Mamedova", 1988);
        Pet pet = new Pet("Dog", "Rex", 6, 75, new String[]{"eat, ", "sleep, ", "walk, ", "play"});
        Human kid = new Human("Vaqif", "Mamedov", 2009, 95, pet, female, male);
        kid.describePet();
        kid.greetPet();
        pet.respond();
        pet.eat();
        pet.foul();
        System.out.println(kid.toString());
        System.out.println(pet.toString());

    }
}
