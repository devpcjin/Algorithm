class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        boolean bool[][] = new boolean[board.length+2][board.length+2];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    bool[i][j] = true;
                    bool[i+1][j] = true;
                    bool[i+2][j] = true;
                    bool[i][j+1] = true;
                    bool[i+1][j+1] = true;
                    bool[i+2][j+1] = true;
                    bool[i][j+2] = true;
                    bool[i+1][j+2] = true;
                    bool[i+2][j+2] = true;
                }
            }
        }
        
        for(int i = 1; i < bool.length-1; i++) {
            for(int j = 1; j < bool.length-1; j++) {
                if(!bool[i][j]) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
