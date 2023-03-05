class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals.length;
        }
        
        // Sort intervals by start time
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);
        
        // Use a priority queue to keep track of the end times of meetings in progress
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        
        // Add first meeting to queue
        endTimes.offer(intervals[0][1]);
        
        // Process remaining meetings
        for (int i = 1; i < intervals.length; i++) {
            int[] meeting = intervals[i];
            int currEnd = endTimes.peek();
            if (meeting[0] >= currEnd) {
                // No overlap with current meeting in progress
                endTimes.poll(); // remove current meeting from queue
            }
            // Add new meeting to queue
            endTimes.add(meeting[1]);
        }
        
        // The size of the queue at the end represents the number of rooms needed
        return endTimes.size();
    }
}

