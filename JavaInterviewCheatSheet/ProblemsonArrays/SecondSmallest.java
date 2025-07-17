package JavaInterviewCheatSheet;

public class SecondSmallest {
    static int ssmall(int[] arr) {
        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] < small) {
                ssmall = small;
                small = arr[i];
            } else if(arr[i] < ssmall && arr[i] != small) {
                ssmall = arr[i];
            }
        }

        return ssmall;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,1};

        System.out.println(ssmall(arr));

    }
}
