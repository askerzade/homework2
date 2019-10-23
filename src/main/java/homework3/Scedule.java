package homework3;

import java.util.Scanner;

public class Scedule {
    public static void main(String[] args) {
        boolean cycleBreak = false;
        String[][] Schedule = new String[7][2];
        Schedule[0][0] = "Sunday";
        Schedule[0][1] = "do home work";
        Schedule[1][0] = "Monday";
        Schedule[1][1] = "go to courses; watch a film";
        Schedule[2][0] = "Tuesday";
        Schedule[2][1] = "meet with John";
        Schedule[3][0] = "Wednesday";
        Schedule[3][1] = "do home cleaning";
        Schedule[4][0] = "Thursday";
        Schedule[4][1] = "visit grandma";
        Schedule[5][0] = "Friday";
        Schedule[5][1] = "meet with group mates";
        Schedule[6][0] = "Saturday";
        Schedule[6][1] = "call to tutor";
        while (!cycleBreak) {
            System.out.println();
            System.out.println("Please, input the day of the week:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String input1 = input.replace(" ", "");
            switch (input1.toLowerCase()) {
                case "sunday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[0][0], Schedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[1][0], Schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[2][0], Schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[3][0], Schedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[4][0], Schedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[5][0], Schedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your tasks for %s: %s.", Schedule[6][0], Schedule[6][1]);
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
