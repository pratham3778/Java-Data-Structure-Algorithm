package Arrays;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {
            for(int j=left;j<=right;j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for(int i=top;i<=bottom;i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for(int j=right;j>=left;j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            }

            if(left <= right) {
                for(int i=bottom;i>=top;i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> result = sm.spiralOrder(matrix); 
        System.out.println(result); 
    }
}
