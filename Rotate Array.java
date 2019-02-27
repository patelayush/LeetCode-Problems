class Solution {
    public void rotate(int[] nums, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        if(k!=0 && k>nums.length)
            k = k % nums.length;
        for(int i=0;i<k;i++){
            stack.push(nums[(nums.length-1)-i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = stack.pop();
        }
        
    }
}