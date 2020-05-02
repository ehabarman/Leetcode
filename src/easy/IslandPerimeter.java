package easy;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n =  grid[0].length;
        for(int r=0; r < m; r++){
            for(int c=0; c < n; c++){
                if(grid[r][c] == 1){
                    if(r-1 < 0 || grid[r-1][c] == 0)count++;
                    if(r+1 == m || grid[r+1][c] == 0)count++;
                    if(c-1 < 0 || grid[r][c-1] == 0)count++;
                    if(c+1 == n || grid[r][c+1] == 0)count++;
                }
            }
        }
        return count;
    }
}
