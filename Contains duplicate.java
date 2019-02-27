class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            hash_set.add(nums[i]);
        }
        if(hash_set.size() == nums.length){
            return false;
        }
        return true;
    }
}