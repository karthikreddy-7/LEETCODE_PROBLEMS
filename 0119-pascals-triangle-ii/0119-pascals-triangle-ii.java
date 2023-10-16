class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            List<Integer> temp=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    temp.add(1);
                }
                else{
                    List<Integer> prev=res.get(i-1);
                    int val=prev.get(j-1)+prev.get(j);
                    temp.add(val);
                }
            }
            res.add(temp);
        }
        return res.get(rowIndex);
    }
}