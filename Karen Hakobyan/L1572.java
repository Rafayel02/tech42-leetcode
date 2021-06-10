class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n-i-1];
        }
        if (n % 2 == 0) {
            return sum;
        } else {
            return sum - mat[n/2][n/2];
        }
    }
}