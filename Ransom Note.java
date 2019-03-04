class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
            char[] m = magazine.toCharArray();
            char[] r = ransomNote.toCharArray();
            for(int i=0; i < magazine.length(); i++){
                if(map.containsKey(m[i])){
                    map.put(m[i],map.get(m[i]) + 1);
                }else{
                    map.put(m[i],1);
                }
            }
            for(int i=0; i<ransomNote.length(); i++){
                if(map.containsKey(r[i]) && map.get(r[i])!=0){
                    map.put(r[i],map.get(r[i]) - 1);
                }else{
                    return false;
                }
            }
            return true;
    }
}