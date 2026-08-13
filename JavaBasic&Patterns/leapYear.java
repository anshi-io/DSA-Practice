
//whether the year is leapyear or not
import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("its a leap year");
        } else {
            System.out.println("its not a leap year");
        }

    }

}
