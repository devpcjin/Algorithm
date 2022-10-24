import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        boolean bool[][] = new boolean[board.length][board.length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    if(i == 0 && j == 0) {
                        bool[i][j] = true;
                        bool[i+1][j] = true;
                        bool[i][j+1] = true;
                        bool[i+1][j+1] = true;
                    } else if (i == 0 && j == board.length-1) {
                        bool[i][j] = true;
                        bool[i+1][j] = true;
                        bool[i][j-1] = true;
                        bool[i+1][j-1] = true;
                    } else if (i == board.length-1 && j == 0) {
                        bool[i][j] = true;
                        bool[i-1][j] = true;
                        bool[i][j+1] = true;
                        bool[i-1][j+1] = true;
                    } else if (i == board.length-1 && j == board.length-1) {
                        bool[i][j] = true;
                        bool[i-1][j] = true;
                        bool[i][j-1] = true;
                        bool[i-1][j-1] = true;
                    } else if(i == 0 && (j != 0 || j != board.length-1)) {
                        bool[i][j] = true;
                        bool[i][j-1] = true;
                        bool[i+1][j-1] = true;
                        bool[i+1][j] = true;
                        bool[i][j+1] = true;
                        bool[i+1][j+1] = true;
                    } else if(i == board.length-1 && (j != 0 || j != board.length-1)) {
                        bool[i][j] = true;
                        bool[i-1][j] = true;
                        bool[i][j-1] = true;
                        bool[i-1][j-1] = true;
                        bool[i][j+1] = true;
                        bool[i-1][j+1] = true;
                    } else if(j == board.length-1 && (i != 0 || i != board.length-1)) {
                        bool[i][j] = true;
                        bool[i][j-1] = true;
                        bool[i+1][j] = true;
                        bool[i+1][j-1] = true;
                        bool[i-1][j] = true;
                        bool[i-1][j-1] = true;
                    } else if(j == 0 && (i != 0 || i != board.length-1)) {
                        bool[i][j] = true;
                        bool[i][j+1] = true;
                        bool[i+1][j] = true;
                        bool[i+1][j+1] = true;
                        bool[i-1][j] = true;
                        bool[i-1][j+1] = true;
                    } else {
                        bool[i-1][j-1] = true;
                        bool[i][j-1] = true;
                        bool[i+1][j-1] = true;
                        bool[i-1][j] = true;
                        bool[i][j] = true;
                        bool[i+1][j] = true;
                        bool[i-1][j+1] = true;
                        bool[i][j+1] = true;
                        bool[i+1][j+1] = true;
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                
                if(!bool[i][j]) {
                    answer++;
                }
                
            }
        }
        
        return answer;
    }
}
