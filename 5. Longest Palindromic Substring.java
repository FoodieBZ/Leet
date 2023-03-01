class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = startingPoint(s, i, i);
            int len2 = startingPoint(s, i, i+1);
            int lenMax = Math.max(len1,len2);
            if (lenMax > end - start){
                start = i - (lenMax -1) / 2;
                end = i + (lenMax / 2) + 1;
            } 
        }
        return s.substring(start, end);
        
    }

    public int startingPoint(String s, int left, int right) {
        if (s.length() == 0 || left > right) {
            return 0;
        }
        while (left >= 0 && right < s.length() &&  s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}