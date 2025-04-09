package InterviewPrp;/*
 * N=3
 * 
 * print
 * 
 * 789
 * 612
 * 543
 * 
 * */
public class Logicbuilding1 {
	 public static void main(String[] args) {
	        int n = 2; // Size of the matrix (n x n)
	        int[][] matrix = new int[n][n];

	        int value = n+1 * n+1; // Start from the largest value
	        int minRow = 0, maxRow = n;
	        int minCol = 0, maxCol = n;

	        while (value > 0) {
	            // Traverse top row (right to left)
	            for (int i = maxCol; i >= minCol && value > 0; i--) {
	                matrix[minRow][i] = value--;
	            }
	            minRow++;

	            // Traverse left column (top to bottom)
	            for (int i = minRow; i <= maxRow && value > 0; i++) {
	                matrix[i][minCol] = value--;
	            }
	            minCol++;

	            // Traverse bottom row (left to right)
	            for (int i = minCol; i <= maxCol && value > 0; i++) {
	                matrix[maxRow][i] = value--;
	            }
	            maxRow--;

	            // Traverse right column (bottom to top)
	            for (int i = maxRow; i >= minRow && value > 0; i--) {
	                matrix[i][maxCol] = value--;
	            }
	            maxCol--;
	        }

	        // Print the reverse spiral pattern
	        System.out.println("Reverse Spiral Pattern:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j]);
	            }
	            System.out.println();
	        }
	    }

}