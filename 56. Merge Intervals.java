class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);
        List<int[]> results = new ArrayList<>();
        int[] curr = intervals[0];
        results.add(curr);
        for (int[] interval: intervals) {
            int curr_end = curr[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if (curr_end >= next_begin) {
                curr[1] = Math.max(curr_end, next_end);
            }
            else {
                curr = interval;
                results.add(curr);
            }
        }
        return results.toArray(new int[results.size()][]);
    }
}

