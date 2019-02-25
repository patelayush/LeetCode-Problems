class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if(nums.length == 0) return 0;
        for( int i =0; i< nums.length; i++){
            if(nums[i] == target){
                index = i;
                break;
        }
            else if(nums[i] > target){
                index = i;
                break;
            } 
            if( i == nums.length -1){
                index = nums.length;
            }
        }
        return index;
    }
}