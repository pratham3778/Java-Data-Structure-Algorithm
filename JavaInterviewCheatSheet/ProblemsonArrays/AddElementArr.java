package JavaInterviewCheatSheet;

import java.util.ArrayList;
import java.util.*;

public class AddElementArr {
    static int[] insertFirst(int[] arr, int start) {
        int[] newArr = new int[arr.length+1];
        newArr[0] = start;

        for(int i=0;i<arr.length;i++) {
            newArr[i+1] = arr[i];
        }

        return newArr;
    }

    static int[] insertLast(int[] arr, int last) {
        int[] newArr = new int[arr.length+1];
        for(int i=0;i<arr.length;i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = last;

        return newArr;
    }

    static int[] insertMid(int[] arr, int mid) {
        int centre = arr.length/2;
        int[] newArr = new int[arr.length+1];

        for(int i = 0;i<centre;i++) {
            newArr[i] = arr[i];
        }
        newArr[centre] = mid;
        for(int i=centre;i<arr.length;i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 6;
        int last = 7;
        int mid = 8;

        /*int[] res1 = insertFirst(arr, start);
        res1 = insertMid(res1, mid);
        res1 = insertLast(res1, last);
        System.out.println(Arrays.toString(res1));*/

        ArrayList<Integer> al = new ArrayList<>();

        //add all orignal ele
        for(int val : arr) {
            al.add(val);
        }

        //add first
        al.add(0,start);

        //add mid
        int centre = al.size()/2;
        al.add(centre, mid);

        //add last
        al.add(last);

        System.out.println(al);
    }
}
