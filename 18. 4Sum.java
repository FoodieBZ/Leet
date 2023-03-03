class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int high = nums.length-1;
                int low = j+1;
                while (low < high) {
                    if (nums[i]/10 + nums[j]/10 + nums[low] /10 + nums[high] / 10 > Integer.MAX_VALUE/10) {
                        break;
                    }
                    int sum = nums[i] + nums[j]+nums[low]+nums[high];
                    if (target == sum) {
                        answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[low], nums[high])));
                    }
                    if (target > sum) {
                        low++;
                    }
                    else {
                        high--;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>> (answer);
    }
}

