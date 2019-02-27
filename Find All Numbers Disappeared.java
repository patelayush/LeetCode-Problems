class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> b = new ArrayList<>();
        if(nums.length == 0)
             return b; 
        
        int[] a = new int[nums.length+1]; 
        for(int i=1; i<=nums.length;i++){
            a[nums[i-1]] = nums[i-1];
        }
        for(int i=0; i<a.length; i++){
            if(a[i] == 0 && i!=0){
                b.add(i);
            }
        }
        return b;
        
    }
}