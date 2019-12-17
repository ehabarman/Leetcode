package easy;

public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int captureSum = 0;

        int rookRow = 0;
        int rookColumn = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookColumn = j;
                }
            }
        }

        for (int i = rookRow; i < 8; i++) {//up
            if (board[i][rookColumn] == 'p') {
                captureSum++;
                break;
            } else if (board[i][rookColumn] == 'B')
                break;
        }

        for (int i = rookRow; i >= 0; i--) {//down
            if (board[i][rookColumn] == 'p') {
                captureSum++;
                break;
            } else if (board[i][rookColumn] == 'B')
                break;
        }

        for (int j = rookColumn; j >= 0; j--) {//left
            if (board[rookRow][j] == 'p') {
                captureSum++;
                break;
            } else if (board[rookRow][j] == 'B')
                break;
        }

        for (int j = rookRow; j < 8; j++) {//right
            if (board[rookRow][j] == 'p') {
                captureSum++;
                break;
            } else if (board[rookRow][j] == 'B')
                break;
        }
        return captureSum;
    }
}
