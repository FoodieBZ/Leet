class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int size = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ans.size() == 0) {
                j = i;
            }
            char a = s.charAt(i);
            if (ans.contains(a)) {
                size = Math.max(ans.size(), size);
                ans.clear();
                i = j;
            }
            else {
                ans.add(a);
            }
        }
        size = Math.max(ans.size(), size);
        return size; 
    }
}

