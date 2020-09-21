public class Wall extends GamePieces{

    public Wall(int x, int y) {
        super(x, y);
    }

    public boolean isValidMove(){
        return x % 2 == 0 && y % 2 == 0;
    }


}
