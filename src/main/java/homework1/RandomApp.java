package homework1;

import java.util.Random;
import java.util.Scanner;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your Name Is: " + name);
        System.out.println("Let the Game Begins!");
        int[] array = new int[100];
        int arrayLength = array.length;
        int randomNumber = random.nextInt(arrayLength);
        int playerNumber;
         while(true){
            System.out.println("Write your number: ");
            playerNumber = scanner.nextInt();
                if (randomNumber == playerNumber) {
                    System.out.printf("Congratulations, %s! You WON!", name);
                    break;
                }
                if (randomNumber <= playerNumber) {
                    System.out.println("Your number is bigger. Please try again");
                }
                if (randomNumber >= playerNumber) {
                    System.out.println("Your number is smaller. Please try again");
                }
            }
    }}





