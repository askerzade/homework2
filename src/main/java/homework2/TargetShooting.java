package homework2;

import java.util.Random;
import java.util.Scanner;

public class TargetShooting {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        String[][] grid = new String[6][6];
        grid[0][0] = "|0|";
        grid[0][1] = "1|";
        grid[0][2] = "2|";
        grid[0][3] = "3|";
        grid[0][4] = "4|";
        grid[0][5] = "5|";
        grid[1][0] = "|1|";
        grid[2][0] = "|2|";
        grid[3][0] = "|3|";
        grid[4][0] = "|4|";
        grid[5][0] = "|5|";
        int target = grid.length;
        Random random = new Random();
        int targetHorizontal;
        int targetVertical;
        int playerHorizontal;
        int playerVertical;
        boolean cycleBreak = false;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        do {
            targetHorizontal = random.nextInt(target);
            targetVertical = random.nextInt(target);
        } while (!(targetHorizontal != 0 & targetVertical != 0));

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++)
                grid[i][j] = "-|";
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++)
                System.out.print(grid[i][j]);
        }
        System.out.println();
        while (!cycleBreak) {
            System.out.println();
            while (true) {
                System.out.println("Chose horizontal shooting coordinate");
                playerHorizontal = scanner1.nextInt();
                if (playerHorizontal == 0 || playerHorizontal > 5)
                    System.err.println("inappropriate coordinate!");
                else break;
            }
            while (true) {
                System.out.println("Chose vertical shooting coordinate");
                playerVertical = scanner2.nextInt();
                if (playerVertical == 0 || playerVertical > 5)
                    System.err.println("inappropriate coordinate!");
                else break;
            }
            if (playerHorizontal == targetHorizontal && playerVertical == targetVertical) {
                cycleBreak = true;
                grid[playerHorizontal][playerVertical] = "x|";
                System.out.println();
                System.out.println("Congratulation! You have Won!");
            } else grid[playerHorizontal][playerVertical] = "*|";
            for (int i = 0; i < 6; i++) {
                System.out.println();
                for (int j = 0; j < 6; j++)
                    System.out.print(grid[i][j]);
            }

        }
    }
}
