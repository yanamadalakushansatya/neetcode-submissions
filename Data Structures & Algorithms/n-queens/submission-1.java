class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String>ls=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();
        char[][]board=new char [n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }

       int []left=new int[n];
       int []leftd=new int[n*2-1];
       int []rightd=new int[2*n-1];

       slove(ls,ans,board,left,leftd,rightd,0,n);
        return ans;
    }

    public void slove( List<String>ls,List<List<String>>ans,char[][]board,
                        int []left,int []leftd,int []rightd,int col,int n)
                        {
                            if(col==n)
                            {
                                for(int i=0;i<n;i++)
                                {
                                    ls.add(new String(board[i]));
                                }
                                ans.add(new ArrayList<>(ls));
                                ls.clear();
                                return;
                            }
                            for(int row=0;row<n;row++)
                            {
                                if(left[row]==0 && leftd[row+col]==0 && rightd[(n-1)+(col-row)]==0)
                                {
                                    board[row][col]='Q';
                                    left[row]=1;
                                    leftd[row+col]=1;                                       //line 37 to 47 imp
                                     rightd[(n-1)+(col-row)]=1;

                                    slove(ls,ans,board,left,leftd,rightd,col+1,n);
                                    
                                    board[row][col]='.';
                                      left[row]=0;
                                    leftd[row+col]=0;
                                     rightd[(n-1)+(col-row)]=0;
                                }
                            }
                        }
}
