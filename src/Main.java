import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final long MOD = 998244353;

    // Helper method for modular exponentiation
    public static long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }

    public static int goodHeap(int N, int M, int K, int X, int[] A) {
        long[][] dp = new long[N + 1][K + 2];

        int[] initialCounts = new int[M + 1];
        Arrays.sort(A);
        int currentCount = 0;
        int arrIdx = 0;
        for (int v = 1; v <= M; v++) {
            while (arrIdx < N && A[arrIdx] <= v) {
                currentCount++;
                arrIdx++;
            }
            initialCounts[v] = currentCount;
        }

        for (int p = 0; p <= K; p++) {
            for (int v = 1; v <= M; v++) {
                int j = initialCounts[v];
                dp[j][p] = (dp[j][p] + power(v, p)) % MOD;
            }
        }

        // --- Main DP Loop (O(N * K^2)) ---
        for (int k = 1; k <= K; k++) {
            long[][] next_dp = new long[N + 1][K + 2];
            for (int p = k; p >= 0; p--) {
                for (int j = 0; j <= N; j++) {
                    long val = 0;
                    if (j > 0 && j < X) {
                        val = (val + dp[j - 1][p + 1]) % MOD;
                    }
                    if (j + 1 >= X) {
                        val = (val + dp[j][p + 1]) % MOD;
                    }
                    if (j < X) {
                        long term = (M * dp[j][p] % MOD - dp[j][p + 1] + MOD) % MOD;
                        val = (val + term) % MOD;
                    }
                    if (j < N && j + 1 >= X) {
                        long term = (M * dp[j + 1][p] % MOD - dp[j + 1][p + 1] + MOD) % MOD;
                        val = (val + term) % MOD;
                    }
                    next_dp[j][p] = val;
                }
            }
            dp = next_dp;
        }
        long totalSumOfCounters = 0;
        for (int j = 0; j <= N; j++) {
            totalSumOfCounters = (totalSumOfCounters + j * dp[j][0]) % MOD;
        }
        long term1 = (power(M, K) * ((long)(M + 1) * N % MOD)) % MOD;
        long finalTotalSum = (term1 - totalSumOfCounters + MOD) % MOD;
        return (int) finalTotalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(goodHeap(N, M, K, X, A));
    }
}