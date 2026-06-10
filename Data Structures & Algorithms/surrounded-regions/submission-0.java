class Solution {
    public void DFS(char[][] grid, int i, int j){

        if(i<0 || i >= grid.length || j <0 || j >=grid[0].length) return;
        

        if(grid[i][j] == 'O'){

            grid[i][j] = 'T';

            DFS(grid, i-1, j);
            DFS(grid, i+1, j);
            DFS(grid, i, j-1);
            DFS(grid, i, j +1);

        }
    }
    public void solve(char[][] grid) {
        
        for(int i = 0; i <grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(j == 0){
                    DFS(grid, i, j);

                }
                if(i == grid.length -1){
                    DFS(grid, i , j);
                }
                if(i == 0){
                    DFS(grid, i, j);

                }
                if(j == grid[0].length -1){
                    DFS(grid, i, j);
                }
            }
        
        }  

        for(int i = 0; i <grid.length; i++){
            for(int j = 0; j <grid[0].length; j++){

                if(grid[i][j] == 'O') grid[i][j] = 'X';
                if(grid[i][j] == 'T') grid[i][j] = 'O';
            }
        } 
        
    }
}
