package Task1;

import java.util.Scanner;

public class MarioPyramid {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = x.nextInt();
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - (i + 1); space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
