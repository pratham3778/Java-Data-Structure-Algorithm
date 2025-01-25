package Arrays;

public class SearchATwoDMatrix {
    /*public static int binarySearch(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;

        while(low<=high) {
            int mid = low + (high-low)/2;
            if(matrix[mid] == target) {
                return mid;
            } else if(matrix[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    } */
    public boolean searchMatrix(int[][] matrix, int target) {
        /* BRUTE FORCE : tc - 0(n)
        for(int i=0;i<matrix.length-1;i++) {
            for(int j=0;j<matrix.length-1;j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;*/

        /*//BINARY SEARCH : tc - 0(n) + log(m)
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for(int i=0;i<matrix.length-1;i++) {
            if(matrix[i][0] <= target && target <= matrix[i][matrix[i].length-1]){
                int index = binarySearch(matrix[i], target);
                return index != -1;
            }
        }
        return false; */

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;
            int row = mid / m;
            int col = mid % m;

            if(matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchATwoDMatrix s = new SearchATwoDMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        
        System.out.println("Target found: " + s.searchMatrix(matrix, target)); 
    }
}
