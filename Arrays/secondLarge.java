package Arrays;
/* Example :
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
*/
public class secondLarge {
  public static int getSecond(int[] arr) {
    //BRUTE FORCE 
    /*if(arr == null || arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n- 1];
        
        for(int i = n -2; i>=0;i--) {
            if(arr[i] != largest) {
                return arr[i];
            }
        }
        
        return -1;*/
    
    //BETTER APPROCH
    /* int largest = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if(secondLargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondLargest;
        } */
    
    //OPTIMAL SOULTION
    int n = arr.length;
    int largest = arr[0];
    int secondLargest = -1;
    
    for(int i=1;i<n;i++) {
        if(arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        }
        else if(arr[i] > secondLargest && arr[i] < largest) {
            secondLargest = arr[i]; 
        } 
    }
    return secondLargest;
  }
    

public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecond(arr));
    }
}
