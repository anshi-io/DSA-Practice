import java.util.*;
public class linearSearch{
   //linear search

   public static int linearSearch(int numArr[],int key){

      for(int i=0;i<=numArr.length;i++){
         if(numArr[i]==key){
            return i;
         }
         
      }
      return -1;
   }

   public static void main(String[] args) {
       int arr_ex[]={2,5,7,9,32,76};
       Scanner sc = new Scanner(System.in);
       int key = sc.nextInt();
       int linear_search_index=linearSearch(arr_ex, key);
       System.out.println(linear_search_index);
       
    
   }
}