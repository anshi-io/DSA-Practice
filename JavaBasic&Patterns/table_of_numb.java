import java.util.*;
public class table_of_numb {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int product=1;
        System.out.println("Table of "+n+"is:");
        for(int i=1;i<=10;i++){
            product=n*i;
            System.out.println(product);
        }
    }
}


