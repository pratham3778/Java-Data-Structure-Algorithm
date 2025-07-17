package JavaInterviewCheatSheet;

public class Smallest {

    public static int small(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,0,2,1};

        System.out.println(small(arr));
    }
}
