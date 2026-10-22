class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for( int i : nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        } 
        for(int j : mp.keySet())
        {
            if(mp.get(j)>1)
            return j;
        }
        return -1;
    }
}
