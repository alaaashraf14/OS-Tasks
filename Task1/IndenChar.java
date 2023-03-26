package Task1;
import java.util.Scanner;
public class IndenChar {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Your Text : ");
        String text = x.nextLine();
        System.out.print("Enter Your Character : ");
        char ch = x.next().charAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (ch == text.charAt(i)) {
                System.out.print("["+i+ "]");
            }
        }
    }
}