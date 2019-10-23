package homework3;

import java.util.Scanner;

public class Scedule {
    public static void main(String[] args) {
        boolean cycleBreak = false;
        String[][] Scedule = new String[7][2];
        Scedule[0][0] = "Sunday";
        Scedule[0][1] = "do home work";
        Scedule[1][0] = "Monday";
        Scedule[1][1] = "go to courses; watch a film";
        Scedule[2][0] = "Tuesday";
        Scedule[2][1] = "meet with John";
        Scedule[3][0] = "Wednesday";
        Scedule[3][1] = "do home cleaning";
        Scedule[4][0] = "Thursday";
        Scedule[4][1] = "visit grandma";
        Scedule[5][0] = "Friday";
        Scedule[5][1] = "meet with group mates";
        Scedule[6][0] = "Saturday";
        Scedule[6][1] = "call to tutor";
        while (!cycleBreak) {
            System.out.println();
            System.out.println("Please, input the day of the week:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String input1 = input.replace(" ", "");
            switch (input1.toLowerCase()) {
                case "sunday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[0][0], Scedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[1][0], Scedule[1][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[2][0], Scedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[3][0], Scedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[4][0], Scedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[5][0], Scedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your tasks for %s: %s.", Scedule[6][0], Scedule[6][1]);
                    break;

                case "exit":
                    cycleBreak = true;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
