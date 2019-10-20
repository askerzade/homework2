package homework2;

import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        String[][] a = new String[6][6];
        a[0][0] = "|0|";
        a[0][1] = "1|";
        a[0][2] = "2|";
        a[0][3] = "3|";
        a[0][4] = "4|";
        a[0][5] = "5|";
        a[1][0] = "|1|";
        a[2][0] = "|2|";
        a[3][0] = "|3|";
        a[4][0] = "|4|";
        a[5][0] = "|5|";
        int b = a.length;
        Random random = new Random();
        int targethorizontal;
        int targetvertical;
        int playerhorizontal;
        int playervertical;
        boolean isTrue = false;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        do {
            targethorizontal = random.nextInt(b);
            targetvertical = random.nextInt(b);
        } while (!(targethorizontal != 0 & targetvertical != 0));

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++)
                a[i][j] = "-|";
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++)
                System.out.print(a[i][j]);
        }
        System.out.println();
        while (!isTrue) {
            System.out.println();
            while (true) {
                System.out.println("Chose horizontal shooting coordinate");
                playerhorizontal = s1.nextInt();
                if (playerhorizontal == 0 || playerhorizontal > 5)
                    System.err.println("inappropriate coordinate!");
                else break;
            }
            while (true) {
                System.out.println("Chose vertical shooting coordinate");
                playervertical = s2.nextInt();
                if (playervertical == 0 || playervertical > 5)
                    System.err.println("inappropriate coordinate!");
                else break;
            }
            if (playerhorizontal == targethorizontal && playervertical == targetvertical) {
                isTrue = true;
                a[playerhorizontal][playervertical] = "x|";
                System.out.println();
                System.out.println("Congratulation! You have Won!");
            } else a[playerhorizontal][playervertical] = "*|";
            for (int i = 0; i < 6; i++) {
                System.out.println();
                for (int j = 0; j < 6; j++)
                    System.out.print(a[i][j]);
            }

        }
    }
}
