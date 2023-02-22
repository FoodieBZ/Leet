// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution {
    public int[] solution(int[] A, int K) {
        int[] a = new int[A.length];
        if (A.length == 1 || K == 0) {
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            if (!(i + K > A.length - 1)) {
                a[i+K] = A[i];
            }
            else {
                int temp = i+K;
                while((temp > A.length - 1)) {
                    temp -= A.length; 
                }
                a[temp] = A[i];
            }
        }
        return a;
    }
}