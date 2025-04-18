package Arrays.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Rotate_Image_Matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		for (int i = 0; i < mat.length; i++) {
			List<Integer> rowList = Arrays.stream(mat[i]).boxed().collect(Collectors.toList());
			Collections.reverse(rowList);
			mat[i] = rowList.stream().mapToInt(Integer::intValue).toArray();
		}
		System.out.println("Updated Matrix:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
        
        
		int[][] ans = new int[matrix.length][matrix[0].length];
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				ans[j][matrix.length - 1 - i] = matrix[i][j];
			}
		}
		for (int[] is : ans) {
			System.out.println(Arrays.toString(is));
		}

	}

}
