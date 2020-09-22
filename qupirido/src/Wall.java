import java.util.Scanner;

public class Wall extends GamePieces{
    private int x2;
    private int y2;

    public Wall(int x, int y) {
        super(x, y);
        x2 = x;
        y2 = y;
    }

    public Wall(int x, int y, int x2, int y2){
        super(x, y);
    }

    //check to see if the move is valid
    public boolean isValidMove(){
        return x % 2 == 0 && y % 2 == 0;
    }

    public static int getXWall(Scanner s){
        System.out.println("Input x location for wall");
        return s.nextInt();
    }

    public static int getYWall(Scanner s){
        System.out.println("Input y direction for wall");
        return s.nextInt();
    }

    public int getX2(){
        return x2;
    }

    public int getY2(){
        return y2;
    }

    //put in the second half.
    public void blockSecond(int x, int y){
        x2 = x;
        y2 = y;
    }



}
