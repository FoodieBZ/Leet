class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftMostValue = binarySearch(nums, target, true);
        int rightMostValue = binarySearch(nums, target, false);
        return new int[]{leftMostValue, rightMostValue};
    }
    public int binarySearch(int[] nums, int target, boolean leftMostTarget) {
        int left = 0;
        int right = nums.length-1;
        int answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                answer = mid;
                if (leftMostTarget) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return answer;
    }
}