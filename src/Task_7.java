public class Task_7 {

    static int[][] matrix;

    public static void fillSpiral(int top, int bottom, int left, int right, int num) {
        if (top > bottom || left > right) return;

        for (int i = left; i <= right; i++) matrix[top][i] = num++;
        for (int i = top + 1; i <= bottom; i++) matrix[i][right] = num++;
        for (int i = right - 1; i >= left; i--) matrix[bottom][i] = num++;
        for (int i = bottom - 1; i > top; i--) matrix[i][left] = num++;

        fillSpiral(top + 1, bottom - 1, left + 1, right - 1, num);
    }

    public static void main(String[] args) {
        int n = 3;
        matrix = new int[n][n];

        fillSpiral(0, n - 1, 0, n - 1, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}