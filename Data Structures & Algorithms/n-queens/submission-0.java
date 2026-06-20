class Solution {

    Set<Integer> cols = new HashSet<>();
    Set<Integer> diag = new HashSet<>();
    Set<Integer> anti = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> result = new ArrayList<>();
        backTrack12(n, 0, result, new ArrayList<>());
        return result;
    }

    public void backTrack12(int n, int row, List<List<String>> result, List<String> list){

    if( row == n) result.add(new ArrayList(list));

    
    for(int col = 0 ; col < n; col++){
    StringBuilder sb = new StringBuilder(); 
        
    if(!cols.contains(col) && !diag.contains(row -col) && !anti.contains(row+col)){

        cols.add(col);
        diag.add(row-col);
        anti.add(row+col);
    
    for(int i =0; i <n; i++){
        
        if(i == col) sb.append('Q');
        else sb.append('.');
    }

    list.add(sb.toString());

    backTrack12(n, row+1, result, list);
       
       cols.remove(col);
       diag.remove(row-col);
       anti.remove(row+col);

       list.remove(list.size() -1);
    }

    }
   
     

}}

/*
1. base case- when all grid positions have been explored
2. choice- we start off with placing a queen in a position in row
3. check for valid positions except, Horizontally,vertically and diagonally
4. undo- the positions where a queen has been placed such that we can explore
valid position for other queens
5. My concern is Alfred that positions of queens is relative right
so how do we set under implied constraint
6. and whats difference between all solutions and unique solutions

*/