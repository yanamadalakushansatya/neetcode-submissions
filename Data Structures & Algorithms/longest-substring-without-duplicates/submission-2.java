class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int len=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(int right =0;right<s.length();right++)
        {
            if(mp.containsKey(s.charAt(right)))
            {
                left=Math.max(left,mp.get(s.charAt(right))+1);
            }
            mp.put(s.charAt(right),right);
            len=Math.max(len,right-left+1);
        }
        return len;
    }
}
