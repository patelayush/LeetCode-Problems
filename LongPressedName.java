class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed))
            return true;
        if(name.equals("") || typed.equals(""))
            return false;
        int i=0, j=0;
        if(typed.length() < name.length())
            return false;
        char[] ch = name.toCharArray();
        char[] ci = typed.toCharArray();
        while(i < name.length() && j < typed.length()){
            if(ch[i] == ci[j]){
                i++;
                j++;
            }
            else if(i!=0 && ch[i-1] == ci[j]){
                j++;
            }
            else{
                break;
            }
        }
        if(i == name.length())
            return true;
        else return false;
        
    }
}