public class GamePieces {
    private int x;
    private int y;
    public boolean pawn;

    GamePieces(int x, int y, boolean pawn){
        this.x = x;
        this.y = y;
        this.pawn = pawn;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void movePiece(int x, int y){
        this.x = x;
        this.y = y;
    }
}
