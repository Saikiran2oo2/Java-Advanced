package Arrays.Medium;

import java.util.Arrays;

public class Marking_Zeros_In_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1}
        };
        int[][] matrix1 = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
            };

        int[][] result = markZeros(matrix);
        int[][] ans=optimal_Solution(matrix1);
        for (int[] ele : ans) {
            System.out.println(Arrays.toString(ele));
        }
        System.out.println("\n");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] optimal_Solution(int[][] matrix1) {
		int col=matrix1.length;//matrix[..][0]
		int row=matrix1[0].length;//matrix[0][..]
		int col0=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(matrix1[i][j]==0) {
					//marking i-th row
					matrix1[i][0]=0;
					// marking j-th col
					if(j!=0) matrix1[0][j]=0;
					else col0=0;	
				}
			}
		}
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				if(matrix1[i][0]==0 || matrix1[0][j]==0 ) {
					matrix1[i][j]=0;
				}
			}
		}
		if(matrix1[0][0]==0) {
			for(int j=0;j<row;j++) matrix1[0][j]=0;
		}
		if(col0==0) {
			for(int i=0;i<row;i++) {
				matrix1[i][0]=0;
			}
		}
		
		return matrix1;
	}

	private static int[][] markZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlags = new boolean[rows];
        boolean[] colFlags = new boolean[cols];

        // Step 1: Mark rows and columns that contain a zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags[i] = true;
                    colFlags[j] = true;
                }
            }
        }

        // Step 2: Update matrix based on marked rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlags[i] || colFlags[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
