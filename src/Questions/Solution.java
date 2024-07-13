package Questions;

class Solution {
    public static int orangesRotting(int[][] grid) {
        int row=0, col=0;
        boolean[][] vis = new boolean[grid.length][grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==2){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        int res = helper(grid,0,row,col,vis);

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return res;
    }
    public static int helper(int[][] grid, int count,int row, int col,boolean[][] vis){
        if(grid[row][col]==1){
            count++;
            grid[row][col]=2;
        }
        if(grid[row][col]==2 && vis[row][col]==false){
            vis[row][col]=true;
            if(row>0 && col>0 && row<grid.length-1 && col<grid.length-1){
                count=Math.max(count,helper(grid,count,row-1,col, vis));
                count=Math.max(count,helper(grid,count,row,col+1, vis));
                count=Math.max(count,helper(grid,count,row+1,col, vis));
                count=Math.max(count,helper(grid,count,row,col-1, vis));
            }
            else if(row==0){
                if(col==0){
                    count=Math.max(count,helper(grid,count,row,col+1, vis));
                } else if(col==grid.length-1) {
                    count=Math.max(count,helper(grid,count,row,col-1, vis));
                } else{
                    count=Math.max(count,helper(grid,count,row,col+1, vis));
                    count=Math.max(count,helper(grid,count,row,col-1, vis));
                }
                count = Math.max(count, helper(grid,count,row+1,col, vis));
            } else if(row==grid.length-1){
                if(col==0){
                    count=Math.max(count,helper(grid,count,row,col+1, vis));
                } else if(col==grid.length-1) {
                    count=Math.max(count,helper(grid,count,row,col-1, vis));
                } else{
                    count=Math.max(count,helper(grid,count,row,col+1, vis));
                    count=Math.max(count,helper(grid,count,row,col-1, vis));
                }
                count = Math.max(count, helper(grid,count,row-1,col, vis));

            } else if(col==0){
                if(row==0){
                    count=Math.max(count,helper(grid,count,row+1,col, vis));
                } else if(row==grid.length-1) {
                    count=Math.max(count,helper(grid,count,row-1,col, vis));
                } else{
                    count=Math.max(count,helper(grid,count,row+1,col, vis));
                    count=Math.max(count,helper(grid,count,row-1,col, vis));
                }
                count = Math.max(count, helper(grid,count,row,col+1, vis));
            } else{
                if(row==0){
                    count=Math.max(count,helper(grid,count,row+1,col, vis));
                } else if(row==grid.length-1) {
                    count=Math.max(count,helper(grid,count,row-1,col, vis));
                } else{
                    count=Math.max(count,helper(grid,count,row+1,col, vis));
                    count=Math.max(count,helper(grid,count,row-1,col, vis));
                }
                count = Math.max(count, helper(grid,count,row,col-1, vis));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
}