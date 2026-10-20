class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int a : nums)
        {
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        List<Integer>ls=new ArrayList<>(mp.keySet());
        ls.sort((a,b) -> mp.get(b) - mp.get(a));
        int ans[]=new int [k];
        for(int i =0;i<k;i++)
        {
            ans[i]=ls.get(i);
        }
        return ans;
    }
}
