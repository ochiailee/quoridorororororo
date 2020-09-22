import java.util.Scanner;

public class Wall extends GamePieces{

    public Wall(int x, int y) {
        super(x, y);
    }

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

}
