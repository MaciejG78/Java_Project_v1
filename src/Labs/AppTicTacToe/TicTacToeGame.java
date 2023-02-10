package Labs.AppTicTacToe;

public class TicTacToeGame {
    private String[] gameBoard;
    private String turn;

    public TicTacToeGame() {
        initializeBoard();
    }

    private void initializeBoard() {
        this.gameBoard = new String[9];
        for (int i = 0; i < 9; i++) {
            this.gameBoard[i] = String.valueOf(i + 1);
        }
    }

    public String[] getBoard() {
        return gameBoard;
    }

    public void setBoard(String[] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    /* Board
            +---+---+---+
            | 1 | 2 | 3 |
            |---+---+---|
            | 4 | 5 | 6 |
            |---+---+---|
            | 7 | 8 | 9 |
            +---+---+---+
    */
    public void printBoard() {
        System.out.println("+---+---+---+");
        System.out.println("| " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + " |");
        System.out.println("+---+---+---+");
    }
}
