class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //Starting from end find the last element that isnt ascending
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        //Starting from the back find the first element bigger than element i and swap
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        //reverse elements to ascending order after element i
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}