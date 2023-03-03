class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] characters = {{'1'},{'a', 'b', 'c'}, {'d', 'e', 'f'},{'g', 'h', 'i'},{'j', 'k', 'l'},{'m', 'n', 'o'},{'p', 'q', 'r', 's'},{'t', 'u', 'v'},{'w', 'x', 'y','z'}};
        List<String> answer = new ArrayList<>();
        if (digits.length() == 0) {
            return answer;
        }
        answer.add("");
        for (int j = 0; j < digits.length(); j++) {
            int index = digits.charAt(j) - '0' - 1;
            List<String> newAnswer = new ArrayList<>();
            for (String s : answer) {
                for (int k = 0; k < characters[index].length; k++) {
                    newAnswer.add(s + characters[index][k]);
                }
            }
            answer = newAnswer;
        }
        return answer;
    }
}
