class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(answer, new ArrayList<>(), nums, new HashSet<>());
        return answer; 
    }

    public void backtrack(List<List<Integer>> answer, List<Integer> temp, int[] nums, Set<Integer> seen) {
        if (temp.size() == nums.length) {
            answer.add(new ArrayList(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                continue;
            }
            seen.add(nums[i]);
            temp.add(nums[i]);
            backtrack(answer, temp, nums, seen);
            seen.remove(nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}

public List<List<Integer>> permute(int[] nums) {
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
        if (used[i]) {
            continue;
        }
        used[i] = true;
        temp.add(nums[i]);
        backtrack(answer, temp, nums, used);
        used[i] = false;
        temp.remove(temp.size()-1);
    }
}