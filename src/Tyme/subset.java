package Tyme;

public class subset {
    public int count(int n, int[] arr, int sum) {
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8};
        int sum = 11;
        int n = arr.length;

        int count = countSubsets(arr, n, sum);
        System.out.println("Number of subsets with sum 10: " + count);
    }
}
