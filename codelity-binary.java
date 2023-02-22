// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int[] binary = new int[35];
        int id = 0;
        int num = N;
        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        int ans = 0;
        int curr = 0;
        boolean oneV = false;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0 && oneV) {
                curr++;
            }
            else if (binary[i] == 1) {
                oneV = true; 
                ans = Math.max(ans, curr); 
                curr = 0;
            }
        }
        return ans;
    }
}