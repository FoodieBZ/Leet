class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backtrack(answer, "", 0, 0, n);
        return answer; 
    }

    public void backtrack(List<String> nums, String curr, int open, int close, int max)     
    {
        if (curr.length() == max *2) {
            nums.add(curr);
            return;
        }
        if (open < max) {
            backtrack(nums, curr + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(nums, curr + ")", open, close + 1, max);
        }
    }
}