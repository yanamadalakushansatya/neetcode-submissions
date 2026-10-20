class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt=0;
        int max=0;
        Set<Integer>st=new HashSet<>();
        for(int x : nums)
        {
            st.add(x);
        }
        for(int a : nums)
        {
            if(!st.contains(a-1))
            {
                int current=a;
                cnt=1;
                while(st.contains(current+1))
                {
                    current++;
                    cnt++;
                }
                max=Math.max(max,cnt);         
               }
        }
        return max;
    }
}
