
//number is posiitve,negative or zero
import java.util.*;

public class pos_neg_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println(a + " is negative");
        }
        if (a > 0) {
            System.out.println(a + " is positive");
        }
        if (a == 0) {
            System.out.println("itszero!!!");
        } 
    }
}
