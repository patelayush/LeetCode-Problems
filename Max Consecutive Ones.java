class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(maxcount < count)
                    maxcount = count;
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j] == 1){
                        i = j;
                        count++;
                        if(maxcount < count)
                            maxcount = count;   
                    } else{
                        i = j;
                        count = 0;
                        break;
                    }
                }
                   
            }
        }
        return maxcount;
        
    }
}