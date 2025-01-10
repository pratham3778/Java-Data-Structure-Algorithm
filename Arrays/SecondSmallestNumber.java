Package Arrays;

public class SecondSmallestNumber {
  public static int sSmallest(int[] arr) {
        int smallest = -1;
        int ssmallest = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

  public static void main(String[] args) {
       int[] arr = {12,35,1,10,34,1};
       int result = sSmallest(arr);
       System.out.println(result);
    }
}
