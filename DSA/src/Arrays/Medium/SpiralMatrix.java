package Arrays.Medium;

import java.util.Arrays;

public class SpiralMatrix {
    public static int[][] getSpiralMatrix(int[][] mat) {
        int n = mat.length;
        int[][] result = new int[1][n * n]; // Storing elements in a 1D array
        
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        int index = 0;
        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                result[0][index++] = mat[top][i];
            }
            top++;
            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result[0][index++] = mat[i][right];
            }
            right--;
            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[0][index++] = mat[bottom][i];
                }
                bottom--;
            }
            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[0][index++] = mat[i][left];
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] spiralArray = getSpiralMatrix(mat);

        System.out.println("Spiral Order as a 2D Array:");
        System.out.println(Arrays.deepToString(spiralArray));
    }
}
