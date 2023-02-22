class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > 1) {
                return true;
            }
        }
        return false;
    }
}

public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}

Set<Integer> a = new HashSet<>(nums.length)
Set<Integer> a = new HashSet<>(nums.length)

Map<Integer, Integer> a = new HashMap<>();











Map<Integer, Integer> a = new HashMap<>();
Set<Integer> a = new HashSet<>(some.length);
