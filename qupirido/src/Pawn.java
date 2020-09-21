public class Pawn extends GamePieces{

    public Pawn(int x, int y) {
        super(x, y);
    }

    public boolean determineTopBlocking(GamePieces[][] board){
        return board[x+1][y] != null;
    }

    public boolean determineRightBlocking(GamePieces[][] board){
        return board[x][y+1] != null;
    }

    public boolean determineLeftBlocking(GamePieces[][] board){
        return board[x][y-1] != null;
    }
    public boolean determineBotBlocking(GamePieces[][] board){
        return board[x-1][y] != null;
    }

    public boolean CheckPlayerValid(GamePieces[][] board){
        return x % 2 == 1 && y % 2 == 1;
    }
}
