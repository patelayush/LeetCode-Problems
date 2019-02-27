class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int[] c = new int[nums1.length];
        int i = 0, j=0;
        while(i <= m && j <= n){
            if( i == m && j == n)
                break;
            else if(i == m && j < n){
                c[index] = nums2[j];
                index++;
                j++;    
            }
            else if(j == n && i < m){
                c[index] = nums1[i];
                index++;
                i++;
            }else {
                if(nums1[i] < nums2[j]){
                    c[index] = nums1[i];
                    index ++;
                    i++;
                }else{
                    c[index] = nums2[j];
                    index++;
                    j++;
                }     
            }
        }
            
        for(int k=0; k<c.length; k++){
            nums1[k] = c[k];
        }
    }
}