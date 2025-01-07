package Arrays;
import java.util.*;

public class MissingNumber {
    public static int mn(int []a, int N) {
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){ return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = mn(a, N);
        System.out.println(ans);
    }

}

