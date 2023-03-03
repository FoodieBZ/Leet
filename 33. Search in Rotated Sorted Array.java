/* Mid = start - (end - start) /2
 * Mid = target  
 *  return
 * two conditions 
 *      Regular - if start <= mid 
 *        if target is greater than last and target is less than mid
 *           mid > target >= end  
 *           end = mid - 1
 *        mid < target <= end 
 *            start = mid + 1
 *            
 *      Something is wrong - if start >= mid
 *          mid < target <= end 
 *              mid = start+1
 *          mid > target >= end  
 *              mid = end - 1
 */
 class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) 
                return mid;
            else if (nums[mid] >= nums[start]) { 
                if (target >= nums[start] && target < nums[mid]) 
                    end = mid - 1;
                else 
                    start = mid + 1;
            }
            else {
                if (target <= nums[end] && target > nums[mid]) 
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
        }
        return -1;
    }
}