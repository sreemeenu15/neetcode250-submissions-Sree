class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTrack8(n,  new StringBuilder(), 0, 0, result);
       
        return result;
    }

    public void backTrack8(int n, StringBuilder sb, int open , int close, List<String> result){

        if(open + close == 2*n) {
            result.add(sb.toString());
            return;
            }

        if(open < n){
            sb.append("(");
            backTrack8(n, sb, open+1, close, result);
            sb.deleteCharAt(sb.length() -1);
        }
        
        if(close < open){
            sb.append(")");
            backTrack8(n, sb,open, close +1, result);
            sb.deleteCharAt(sb.length() -1);
        }
    }
}

/*
1. the code has structural issues, like while building String
what shall I use?

2. then Love, that when does this undo operation happens
do we decide that

3. I could have issues with method names and stuff, please review the code
and lets write together under 5 min

4. You shall give me essential tools and concepts and I shall figure 
out and write the code.
*/

