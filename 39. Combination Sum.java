class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        backtrack(candidates, target, 0, temp, results);
        return results;
    }
    public void backtrack(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> results) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            results.add(new ArrayList(temp));
        }
        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, temp, results);
            temp.remove(temp.size() - 1);
        }
    }
}

