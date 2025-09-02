package array;

public class MooreVotingAlgo {
    public static int findMajority(int[] arr, int n) {
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return (count > n / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,9,2,2};
    }
}
