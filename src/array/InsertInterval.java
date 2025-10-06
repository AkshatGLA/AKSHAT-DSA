package array;

import java.util.Arrays;

public class InsertInterval {

    // Inserts a new interval into a list of non-overlapping, sorted intervals and merges overlaps.
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval == null || newInterval.length != 2) {
            throw new IllegalArgumentException("newInterval must be a 2-element array");
        }
        int a = newInterval[0];
        int b = newInterval[1];
        if (a > b) { // normalize if needed
            int t = a; a = b; b = t;
        }
        if (intervals == null || intervals.length == 0) {
            return new int[][] { new int[] { a, b } };
        }

        int n = intervals.length;
        int[][] out = new int[n + 1][];
        int i = 0, k = 0;

        // 1) Add all intervals that end before newInterval starts
        while (i < n && intervals[i][1] < a) {
            out[k++] = new int[] { intervals[i][0], intervals[i][1] };
            i++;
        }

        // 2) Merge all intervals that overlap with newInterval
        int start = a;
        int end = b;
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        out[k++] = new int[] { start, end };

        // 3) Add the remaining intervals
        while (i < n) {
            out[k++] = new int[] { intervals[i][0], intervals[i][1] };
            i++;
        }

        // Trim to actual size
        return Arrays.copyOf(out, k);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] result = insert(intervals, newInterval);

        // Print result
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
