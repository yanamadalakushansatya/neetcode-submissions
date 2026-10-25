class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
                StringBuilder sb = new StringBuilder();

        check(0,0,ans,n,sb);
        return ans;
    }
    public void check(int open,int close,List<String>ans,int n,StringBuilder sb)
    {
        if(sb.length()==n*2)
        {
            ans.add(sb.toString());
            return;
        }
            if(open<n)
            {
                sb.append("(");
                check(open+1,close,ans,n,sb);
                sb.deleteCharAt(sb.length()-1);   //to ways to delete the last element from string 
                                                        // (1) sb.deleteCharAt();
            }                                           // (2) sb.setLength();              
            if(close<open)
            {
                sb.append(")");
                check(open,close+1,ans,n,sb);
                sb.setLength(sb.length()-1);
            }
       
    }
}
