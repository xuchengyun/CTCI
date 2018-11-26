package chapter1;

public class RotateMatrix {
    // rotate layer by layer, which can make changes in place
    static void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix == null) return;
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int layer = i;
            int end = n - i - 1;
            for (int j = i; j < end; j++) {
                int top = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = top;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12 }, {13,14,15,16}};
        rotate(matrix);
    }

}
