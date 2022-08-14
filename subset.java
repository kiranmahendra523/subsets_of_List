class Solution {
   
    void solve(int index , int[] nums,List<Integer> cur,List<List<Integer>> res){
        if(index==nums.length){
            res.add(cur);
            return;
        }
        
        
        solve(index+1,nums,new ArrayList(cur),res);
        cur.add(nums[index]);
        solve(index+1,nums, new ArrayList(cur),res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        int index=0;
        solve(index,nums,cur,res);
        return res;
    }
}
