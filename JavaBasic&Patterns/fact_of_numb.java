import java.util.Scanner;

public class fact_of_numb {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product=1;
        for(int i=n;i>=1;i--){
            
            product*=i;
            
        }
      System.out.println("factorial of the number is "+product);
    }
}    