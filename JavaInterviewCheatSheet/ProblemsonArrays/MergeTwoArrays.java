package JavaInterviewCheatSheet;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,5,6,4};
        int[] arr2 = {7,3,2,8};

        int[] res = merge(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }


    private static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] newArr = new int[len1 + len2];

        for(int i=0;i<len1;i++) {
            newArr[i] = arr1[i];
        }
        for(int i=0;i<len2;i++) {
            newArr[i + len1] = arr2[i];
        }

        Arrays.sort(newArr);
        return newArr;
    }
}
