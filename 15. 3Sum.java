class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length; i++){
            int a = nums[i];
            int j= i+1;
            int l =nums.length-1;
            while(j < l){
                int sum = a + nums[j] + nums[l];
                if(sum == 0){                
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(a);
                    list.add(nums[j++]);
                    list.add(nums[l--]);
                    set.add(list);
                }else if(sum < 0){
                    j++;
                    
                }else if(sum > 0){
                    l--;
                }
            }
        }
         return new ArrayList<List<Integer>> (set);
    }
}

 