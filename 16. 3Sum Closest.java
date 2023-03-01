class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int closest = Integer.MAX_VALUE; 
        for (int i = 0; i < nums.length; i++) {
            low = i + 1;
            high = nums.length-1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(closest) > Math.abs(target-sum)) {
                    closest = target-sum; 
                }
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return target - closest;
    }
}