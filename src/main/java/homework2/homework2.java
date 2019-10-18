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
                if(x==0){
                    System.out.print(y+1);
                }
                else System.out.print("-");
            }
        }
    }
}
