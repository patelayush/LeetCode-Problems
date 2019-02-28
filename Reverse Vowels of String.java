class Solution {
    public String reverseVowels(String s) {
        char[] nums = s.toCharArray();
        int i = 0, k = nums.length - 1;
        int index1 = -1, index2 = -1;
        char swap;
        while(i < k){
            if((nums[i] == 'a' || nums[i] == 'e' || nums[i] == 'i' || nums[i] == 'o' || nums[i] == 'u' || nums[i] == 'A' || nums[i] == 'E' || nums[i] == 'I' || nums[i] == 'O' || nums[i] == 'U' ) && index1 == -1){
                index1 = i;
            }
            if((nums[k] == 'a' || nums[k] == 'e' || nums[k] == 'i' || nums[k] == 'o' || nums[k] == 'u' ||
               nums[k] == 'A' || nums[k] == 'E' || nums[k] == 'I' || nums[k] == 'O' || nums[k] == 'U') && index2 == -1){
                index2 = k;
            }
            if(index1 == -1){
                i++;
            }
            if(index2 == -1){
                k--;
            }
            if(index1 != -1 && index2 != -1){
                swap = nums[index1];
                nums[index1] = nums[index2];
                nums[index2] = swap;
                index1 = -1;
                index2 = -1;
                i++;
                k--;
            }
        }
        return new String(nums);
        
    }
}