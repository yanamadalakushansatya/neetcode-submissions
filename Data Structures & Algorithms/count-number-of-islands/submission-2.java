class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    count++;
                dfs(grid,i,j,vis);
                }
            }
        }
        return count;
    }
    public void dfs(char grid[][],int row,int col,boolean vis[][])
    {
        int []dr={-1,1,0,0};
        int []dc={0,0,-1,1};
        if(row<0 || row >= grid.length || col<0  || col >= grid[0].length || vis[row][col] || grid[row][col] == '0')
        {
            return;
        }

              vis[row][col]=true;
                for(int i=0;i<4;i++)
            {
                int r=row+dr[i];
                int c=col+dc[i];
           
            dfs(grid,r,c,vis);
    }        
        
    }
}
