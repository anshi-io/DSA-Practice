import java.util.Scanner;

public class prime_numb {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
            prime=false;
            // break;
           }
        }
        if(prime==true){
         System.out.println(n+"this number is prime");
        }else{
         System.out.println("not a prime number->"+n);
        }
    }
}