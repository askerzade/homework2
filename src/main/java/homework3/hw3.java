package homework3;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        boolean isTrue = false;
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "meet with John";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "do home cleaning";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "visit grandma";
        scedule[5][0] = "Friday";
        scedule[5][1] = "meet with group mates";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "call to tutor";
        while (!isTrue) {
            System.out.println();
            System.out.println("Please, input the day of the week:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String input1 = input.replace(" ", "");
            switch (input1.toLowerCase()) {
                case "sunday":
                    System.out.printf("Your tasks for %s: %s.", scedule[0][0], scedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your tasks for %s: %s.", scedule[1][0], scedule[1][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s.", scedule[2][0], scedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s: %s.", scedule[3][0], scedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your tasks for %s: %s.", scedule[4][0], scedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your tasks for %s: %s.", scedule[5][0], scedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your tasks for %s: %s.", scedule[6][0], scedule[6][1]);
                    break;

                case "exit":
                    isTrue = true;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
