class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int h=0;
        int ans=0;
        int w=0;
        while(left<=right)
        {
            w=right-left;
            h=Math.min(heights[left],heights[right]);
            ans=Math.max(ans,h*w);
          
                if(heights[left]<heights[right])
                {
                    left++;
                }
                else{
                    right--;
                }
        }
        return ans;
    }
}
