class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        for (char letter : s.toCharArray()) {
            freq.put(letter, freq.getOrDefault(letter, 0) + 1);
        }
        for (char letter : t.toCharArray()) {
            freq2.put(letter, freq2.getOrDefault(letter, 0) + 1);
        }
        if (freq.equals(freq2)) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        

        
    if (s.length() != t.length()) {
        return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for (char letter : s.toCharArray()) {
            freq[letter - 'a']++;
        }
        for (char letter : t.toCharArray()) {
            freq[letter - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}