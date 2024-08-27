public class validSudoku {
    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxIdx = new boolean[9][9];

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                char ch = board[i][j];
                if(ch == '.')
                    continue;
                int num = ch - '1'; //converts character to integer.
                int box = (i/3)*3 + j/3;
                if(rows[i][num] || cols[j][num] || boxIdx[box][num])
                    return false;
                rows[i][num] = true;
                cols[j][num] = true;
                boxIdx[box][num] = true;
            }
        }
        return true;  
    }
    
    public static void main(String[] args) {
        char[][] arr = {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                    };
        boolean valid = isValidSudoku(arr);
        System.out.println(valid);
    }
}
