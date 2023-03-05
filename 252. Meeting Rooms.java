class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length <= 1) {
            return true;
        }
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int curr = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < curr) {
                return false; 
            }
            else {
                curr = intervals[i][1];
            }
        }
        return true;
    }
}