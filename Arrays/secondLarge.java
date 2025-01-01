public class secondLarge {
  public static int getSecond(int[] arr) {
    int n = arr.length;
    int largest = -1;
    int secondLargest = -1;

    //find largest element
    for(int i=0;i<n;i++) {
    if(arr[i] > largest) {
      largest = arr[i];
    }
  }

    //find second largest
    for(int i=0;i<n;i++) {
      if(arr[i] > secondLargest && arr[i] != largest) {
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
