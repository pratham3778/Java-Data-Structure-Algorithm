package Arrays;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        /* BRUTE FORCE
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                rotatedMatrix[j][n-i-1] = matrix[i][j]; 
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = rotatedMatrix[i][j];
            }
        } */


        //OPTIMAL
        int row = matrix.length;
        int col = matrix[0].length;

        //transpose
        for(int i=0;i<row;i++) {
            for(int j=i+1;j<col;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i=0;i<row;i++) {
            for(int j=0;j<col/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col-j-1];
                matrix[i][col-j-1] = temp;
            }
        } 
        
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateImage ri= new RotateImage();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ri.rotate(matrix);
        printMatrix(matrix);
    }
}
