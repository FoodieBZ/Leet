class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i-1]) {
                continue;
            }  
            temp.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i+1, temp, results);
            temp.remove(temp.size() - 1);
        }
    }
}