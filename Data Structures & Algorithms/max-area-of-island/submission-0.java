class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int cnt=0;
        int max=0;
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && !vis[i][j])
                {  
                    cnt=dfs(grid,i,j,vis);
                    max=Math.max(max,cnt);
                }
            }
             
        }
        return max;
    }
    public int dfs(int [][] grid,int r,int c,boolean [][] vis)
    {
        if(r<0 || r>=grid.length || c<0 || c>= grid[0].length || vis[r][c] || grid[r][c]==0)
        {
            return 0;
        }
            vis[r][c]=true;
            int area=1;
        int [] dr ={-1,1,0,0};
        int [] dc ={0,0,-1,1};

        for(int i=0;i<4;i++)
        {
            int nr=r+dr[i];
            int nc=c+dc[i];
           area+= dfs(grid,nr,nc,vis);
        }
        return area;
    }
}
