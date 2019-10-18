package homework2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        char[][] a= new char[6][12];
        for(int x=0; x<=a.length-1 ; x++) {
            System.out.println();
            for (int y = 0; y<=a[x].length-1 ; y++) {
                if(y==0) {
                    System.out.print(x);
                }
                if(y==1||y==3||y==5||y==7||y==9||y==11){
                    System.out.print("|");
                }
                else System.out.print("-");
            }
        }
    }
}
