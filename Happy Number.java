class Solution {
    public boolean isHappy(int n) {
        int result = n;
        List<Integer> list = new ArrayList();
        while(!list.contains(result)){
        char[] ch = String.valueOf(result).toCharArray();
        list.add(result);
        result = 0;
        for(int i=0; i<ch.length; i++){
            result += Math.pow(Character.getNumericValue(ch[i]),2);   
            }
        if(result == 1)
            return true;
        }
        
        return false;
    }
}