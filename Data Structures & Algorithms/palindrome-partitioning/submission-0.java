class Solution {
    public List<List<String>> partition(String s) {
        List<String>ls=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();

        check(0,ls,ans,s);

        return ans;
    }
    public void check(int index,List<String>ls,List<List<String>>ans,String s)
    {
        if(index ==s.length())
        {
            ans.add(new ArrayList<>(ls));
            return;
        }

        for(int i=index;i<s.length();i++)
        {
            if(pal(s,index,i))
            {
                ls.add(s.substring(index,i+1));
                check(i+1,ls,ans,s);
                ls.remove(ls.size()-1);
            }
        }
    }
    public boolean pal(String s,int low,int high)
    {
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
        low++;
        high--;
    }
     return true;
    }
   
}
