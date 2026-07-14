//factorial function
import java.util.*;
public class func_factorial_of_num {
    public static int factorial(int num){
        Scanner sc= new Scanner(System.in);
        int product=1;
        for(int i=num;i>=1;i--){
              product*=i;
        }
        return product;
    }
    public static void main(String[] args) {
       int fact_4= factorial(4);
       System.out.println(fact_4);   
    }
    
}
