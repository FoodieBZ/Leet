class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] modCount = new int[60]; // array to keep track of the counts of mod 60 values
        
        for (int t : time) {
            int mod = t % 60;
            int complement = (60 - mod) % 60; // find complement value mod 60
            
            count += modCount[complement]; // add complement counts to overall count
            
            modCount[mod]++; // increment count of current value mod 60
        }
        
        return count;
    }
}