import java.util.*;
public class printSubarray {
  public static void getsubArr(int numArr[]){
    int totalSubarr=0;//to count total subarrays
      for (int i=0;i<numArr.length;i++){
        for(int j=i;j<numArr.length;j++){//we want element as a single subArray
          for(int k = i;k<=j;k++){
            System.out.print(numArr[k]);
          }
          totalSubarr++;
          System.out.println();
        }
        System.out.println();
      }
      System.out.println("Total subarrays of the array is:"+totalSubarr);
      
  }

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int numbArr[]=new int[5];
    for(int i=0;i<numbArr.length;i++){
      numbArr[i]=sc.nextInt();
    }
    
    getsubArr(numbArr);
  }
}
