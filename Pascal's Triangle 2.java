class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list2 = new ArrayList();
        
        for(int i=0; i< rowIndex + 1; i++){
            List<Integer> list1 = new ArrayList<Integer>();
            for(int j=0; j<=i;j++){
                if( j==i || j==0)
                    list1.add(1);
                else
                    list1.add(list2.get(i-1).get(j) + list2.get(i-1).get(j-1));
            }
            list2.add(list1);
        }
        return list2.get(rowIndex);
            
    }
}