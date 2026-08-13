import java.util.*;

public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last_Digit=1;
        int reverse=0;
        while(n>0){
             last_Digit=n%10;
             reverse=(reverse*10)+last_Digit;
            //  System.out.print(last_Digit);
             n/=10;
        }
        System.out.print(reverse);
    }
}
