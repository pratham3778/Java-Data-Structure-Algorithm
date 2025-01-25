package Arrays;

public class II_SearchATwoMatrix {
    /*public static int binarySearch(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(matrix[mid]==target) {
                return mid;
            } else if (matrix[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    } */
    public boolean searchMatrix(int[][] matrix, int target) {
        //brute force : 0(n)
        /*for(int i=0;i<matrix.length-1;i++) {
            for(int j=0;j<matrix.length-1;j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;*/

        //BS : 0(n * log m)
        /*for(int i=0;i<matrix.length;i++) {
            int index = binarySearch(matrix[i], target);
            if(index != -1){
                return true;
            }
         }
         return false;*/

        // bs optimized : 0(n+m)
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] < target) {
                row++;
            } else{
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        II_SearchATwoMatrix s = new II_SearchATwoMatrix();

        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;
        
        System.out.println("Target found: " + s.searchMatrix(matrix, target));

    }
}
