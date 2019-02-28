class Solution {
    public void reverseString(char[] s) {
        char swap;
        int  k = s.length-1;
        int i = 0;
        while(i <= k){
            swap = s[i];
            s[i] = s[k];
            s[k] = swap;
            i++;
            k--;
        }
    }
}