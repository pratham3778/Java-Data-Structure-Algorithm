package JavaInterviewCheatSheet;

public class RotateArrayByK {
    static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for(int i=0;i<k;i++){
            int last = arr[n-1];
            for(int j=n-1;j>0;j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        for(int val : arr) {
            System.out.println(val + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        rotate(arr, k);

    }
}
