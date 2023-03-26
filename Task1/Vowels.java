









































package Task1;
import java.util.Scanner;
public class Vowels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Keyword : ");
        String k = s.nextLine();
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) != 'a' && k.charAt(i) != 'i' && k.charAt(i) != 'e' && k.charAt(i) != 'u' && k.charAt(i) != 'o') {
                {
                    System.out.print(k.charAt(i));
                }
            }
        }
    }
}