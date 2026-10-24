class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>ls=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        boolean [] vis =new boolean[candidates.length];
        check(candidates,0,ls,ans,target);
        return ans;
    }
    public void check(int [] arr,int index,List<Integer>ls,List<List<Integer>>ans,int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(arr[i]>target)
            {
                break;
            }
            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }
                ls.add(arr[i]);
                check(arr,i+1,ls,ans,target-arr[i]);
                ls.remove(ls.size()-1);
        }
    }
}
