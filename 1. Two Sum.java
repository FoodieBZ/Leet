class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i  = 0;
        int j = 0;
        while (i < nums.length) {
            while (j < nums.length) {
                if (j == i) {
                    j+=1;
                }
                if (nums[j] + nums[i] == target) {
                   return new int[] {i, j};
                }
                j+=1;
            }
            i+=1;
            j = 0;
        }
        return null;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
6 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i]
            if (maps.containsKey(num) && maps.get(num) != i) {
                 return new int[] { i, map.get(complement) };
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    