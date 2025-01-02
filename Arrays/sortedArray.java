/* Example :
Input : arr[] = [1,2,3,4]
output : false */

package Arrays;

public class sortedArray {
    public static boolean arrsort(int arr[]) {
        for(int i=1; i<arr.length;i++) {
            if (arr[i] >= arr[i-1]) {
        
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        System.out.println(arrsort(arr));
    }
}
