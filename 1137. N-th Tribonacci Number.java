class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int i = 3;
        int x = 0;
        int y = 1;
        int z = 1; 
        int ans = 0;
        while (i <= n) {
            ans = x + y + z;
            x = y; 
            y = z; 
            z = ans; 
            i += 1;
        } 
        return ans; 
    }
}
