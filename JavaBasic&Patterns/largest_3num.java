
//largest of three numbers
import java.util.*;

public class largest_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        }
        if (b > a && b > c) {
            System.out.println(b + "is the greatest number");
        }
        if (c > a && c > b) {
            System.out.println(c + "is the gretaest number");
        }
    }
}
