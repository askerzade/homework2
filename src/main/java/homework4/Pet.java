package homework4;

public class Pet {
    private String species;
    String byName;
    int age;
    int trickLevel;
    private String[] habits;

    Pet(String species, String byName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.byName = byName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public Pet(String species, String byName) {
        this.species = species;
        this.byName = byName;
    }

    void eat() {
        System.out.println("Я кушаю!");
    }

    void respond() {
        System.out.printf("Привет, хозяин. Я %s. Я соскучился!\n", byName);
    }

    void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    String trickLevel(int trickLevel) {
        String smart = "";
        if (trickLevel < 50 && trickLevel > 0) {
            smart = "почти не хитрый";
        } else if (trickLevel > 50 && trickLevel < 100) {
            smart = "очень хитрый";
        }
        return smart;
    }

    private String listOfHabits(String[] habits) {
        StringBuilder habitsList = new StringBuilder();
        for (String accepter : habits) habitsList.append(accepter);
        return habitsList.toString();
    }

    public String toString() {
        return String.format("%s{nickname=%s, age=%d, trick level=%d, habits=[" + listOfHabits(habits)
                + "]}", species, byName, age, trickLevel);
    }
}
