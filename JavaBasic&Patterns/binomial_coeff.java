
//binomial coeeficient...with the help of function factorial
import java.util.*;

public class binomial_coeff {
    Scanner sc = new Scanner(System.in);

    public static int factorial(int num) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        for (int i = num; i >= 1; i--) {
            product *= i;
        }
        return product;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int diff_fact = factorial(n - r);
        int bin_coeff = n_fact / (r_fact * diff_fact);
        return bin_coeff;
    }

    public static void main(String[] args) {
        int sol = binCoeff(4, 2);
        System.out.println(sol);
        System.out.println(binCoeff(5, 3));
    }
}
