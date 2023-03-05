class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(answer, new ArrayList<>(), nums, used, new HashSet<>());
        return answer; 
    }

    public void backtrack(List<List<Integer>> answer, List<Integer> temp, int[] nums, boolean[] used, Set<List<Integer>> seen) {
        if (temp.size() == nums.length) {
            if (!seen.contains(temp)) {
                seen.add(temp);
                answer.add(new ArrayList(temp));
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            backtrack(answer, temp, nums, used, seen);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(answer, new ArrayList<>(), nums, used);
        return answer; 
    }

    public void backtrack(List<List<Integer>> answer, List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            answer.add(new ArrayList(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i-1])) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            backtrack(answer, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}