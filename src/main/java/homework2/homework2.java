package homework2;

import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        String[][] a = new String[6][6];
        a[0][0] = "0|";
        a[0][1] = "1|";
        a[0][2] = "2|";
        a[0][3] = "3|";
        a[0][4] = "4|";
        a[0][5] = "5|";
        a[1][0] = "1|";
        a[2][0] = "2|";
        a[3][0] = "3|";
        a[4][0] = "4|";
        a[5][0] = "5|";
        int b = a.length;
        Random random = new Random();
        int targethorizontal;
        int targetvertical;
        int playerhorizontal;
        int playervertical;
        boolean isTrue = false;
        int x;
        int y;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        do {
            targethorizontal = random.nextInt(b);
            targetvertical = random.nextInt(b);
        } while (!(targethorizontal != 0 & targetvertical != 0));
        for (x = 0; x < a.length; x++) {
            System.out.println();
            for (y = 0; y < a[x].length; y++) {
                if (x == 0 || y == 0) System.out.print(a[x][y]);
                else System.out.print("-|");
            }
        }
        System.out.println();
        while (!isTrue) {
            System.out.println();
            while (true) {
                System.out.println("Chose horizontal shooting coordinate");
                playerhorizontal = s1.nextInt();
                if (playerhorizontal == 0 || playerhorizontal > 5)
                    System.out.println("inappropriate coordinate!");
                else break;
            }
            while (true) {
                System.out.println("Chose vertical shooting coordinate");
                playervertical = s2.nextInt();
                if (playervertical == 0 || playervertical > 5)
                    System.out.println("inappropriate coordinate!");
                else break;
            }
            if (playerhorizontal == targethorizontal && playervertical == targetvertical) {
                isTrue = true;
                for (x = 0; x < a.length; x++) {
                    System.out.println();
                    for ( y = 0; y < a[x].length; y++) {
                        if (x == 0 || y == 0) System.out.print(a[x][y]);
                   //     else if (x == playerhorizontal && y == playervertical)
                   //         System.out.print("*|");
                        else if (x == playerhorizontal && y == playervertical)
                            System.out.print("x|");
                        else System.out.print("-|");
                    }
                }
                System.out.println();
                System.out.println("Congratulation! You have Won!");
            } else {
                for ( x = 0; x < a.length; x++) {
                    System.out.println();
                    for (y = 0; y < a[x].length; y++) {
                        if (x == 0 || y == 0) System.out.print(a[x][y]);
                        else if (x == playerhorizontal && y == playervertical)
                            System.out.print("*|");
                        else System.out.print("-|");
                    }

                }

            }
        }
    }
}
