class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0 ){
            return 0;
        }
        int count = nums.length - 1;
        int i = 0;
        while(count != i){
            if(nums[i] == val){
                while(count != i && nums[count] == val ){
                    count--;
                }
                if(count !=i){
                nums[i] = nums[count];
                count--;
                }
                else return count;
            }
            else{
                i++;
            }  
        }
        if(nums[count] == val){
            i--;
        }
        return i + 1;
    }
}