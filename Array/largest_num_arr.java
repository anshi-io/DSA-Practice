import java.util.*;
public class largest_num_arr {
  public static int largestNum(int num_Arr[]){
    int largest= Integer.MIN_VALUE;
    for(int i=0; i<num_Arr.length;i++){
      if(largest<num_Arr[i]){
          largest = num_Arr[i];
      }
    }
    return largest;
  }
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    int num_Arr[]= new int[7];
    for(int i = 0; i < num_Arr.length; i++) {
    num_Arr[i] = sc.nextInt();
    }
    int largestNumber=largestNum(num_Arr);
    System.out.println("largest number in the array is:"+largestNumber);
  }
  
}
