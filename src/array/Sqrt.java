package array;

public class Sqrt {
    public static long sqrtN(long N) {
        long low = 1, high = N, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid <= N) {
                ans = mid;   // possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(sqrtN(9));
    }
}
