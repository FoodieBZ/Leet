class Solution {
    public int solution(int[] A) {
        int unpaired = 0;
        for (int i = 0; i < A.length; i++) {
            unpaired ^= A[i];
        }
        return unpaired;
    }
}

1 1 1
1 0 1
0 1 1
0 0 0  