class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        HashMap<Integer, Integer> q = new HashMap<>();
        int array[] = new int[nums1.length];
        for (int n : nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        for (int j : nums2) {
            q.put(j, q.getOrDefault(j, 0) + 1);
        }
        int i = 0;
        for (int x:  m.keySet()) {
            int z = 0;
            int c = 0;
            if (m.get(x) != null) {
                z = m.get(x);
            }
            if (q.get(x) != null) {
                c = q.get(x); 
            }
            while (z > 0 && c > 0) {
                array[i] = x;
                i+=1;
                z--;
                c--;
            }
        }
        int ans[] = new int[i]; 
        for (int t = 0; t < ans.length; t++) {
            ans[t] = array[t];
        }
        return ans;         
    }
}