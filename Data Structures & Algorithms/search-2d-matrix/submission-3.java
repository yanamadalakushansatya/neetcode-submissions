class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row = matrix.length;
    int col=matrix[0].length;

    int low=0;
    int high = (row*col)-1;
    while(low<=high)
    {
        int mid = low+(high-low)/2;

        int rowi=mid/col;
        int coli=mid%col;
        int midel=matrix[rowi][coli];
        if(midel==target)
        {
            return true;
        }
       else if(target>midel)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
        return false;
    }
}
