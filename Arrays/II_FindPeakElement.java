package Arrays;

public class II_FindPeakElement {
     public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if((i == 0 || mat[i][j] > mat[i-1][j]) && //top
                (i == row - 1 || mat[i][j] > mat[i+1][j]) && //bottom
                (j == 0 || mat[i][j] > mat[i][j-1]) && //left
                (j == col - 1 || mat[i][j] > mat[i][j+1])) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        II_FindPeakElement s = new II_FindPeakElement();

        int[][] mat = {
            {1, 4, 3},
            {9, 8, 2},
            {3, 2, 5}
        };
        
        int[] peak = s.findPeakGrid(mat);
        System.out.println("Peak Element found at: [" + peak[0] + ", " + peak[1] + "]");
    }
}
