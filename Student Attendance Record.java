class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                if(count == 0)
                    count = 1;
                else
                    return false;
            }
            if( i+2 < s.length() && s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i+2) =='L'){
                return false;
            }
        }
        return true;
    }
}