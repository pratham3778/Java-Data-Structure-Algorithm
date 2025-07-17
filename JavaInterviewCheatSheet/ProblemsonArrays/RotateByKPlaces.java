package JavaInterviewCheatSheet.ProblemsonArrays;

public class RotateByKPlaces {

    //tc : 0(n * k)
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; //incase if k > n

        for(int i=0;i<k;i++) {
            int last = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }

    //tc : 0(n)
    
    public static void printRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; //incase if k > n

        //rev entire arr
        swap(arr, 0, n-1);
        //rev the first k ele
        swap(arr, 0, k-1);
        //rev remaining ele
        swap(arr, k, n-1);

        //print
        for(int val : arr) {
            System.out.print(val + " ");
        }


    }
    public static void swap(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k = 2;

        printRotate(arr, k);
    }
}
