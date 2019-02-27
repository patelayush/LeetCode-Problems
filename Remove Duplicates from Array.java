class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ){
            return 0;
        }
        int[] a = new int[nums.length];
        int x ;
        int count;
        int length =0 ;
        a[0] = nums[0];
        length =1;
        x = nums[0];
        for(int i = 1; i < nums.length ; i++){
                if(x != nums[i]){
                    a[length] = nums[i];
                    length++;
                    x = nums[i];
                }
        }
        for(int i =0;i<length;i++){
            nums[i] = a[i];
        }
        return length;
    }
}