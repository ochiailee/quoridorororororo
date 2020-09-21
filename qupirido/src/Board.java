import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Board {
    public static final int SIZE = 19;

    public static void main(String[] args) {
        int playerturn = 1;
        GamePieces[][] board = new GamePieces[SIZE][SIZE];
        initializeBoard(board);
        drawBoard(board);
        Scanner s = new Scanner(System.in);

        while(true){
            if(getInputWallorPawn(s) == 1){
                System.out.println("you have selected pawn");

                int x = getX(s);
                int y = getY(s);

                board[17][9].movePiece(x, y);
                board[x][y] = board[17][9];
                board[17][9] = null;


            }
             drawBoard(board);

        }

    }

    public static void drawBoard(GamePieces[][] board){
        char[][] ascii = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if (board[i][j] instanceof Pawn){
                    ascii[i][j] = '0';
                }
                else if (board[i][j] instanceof Wall){
                    ascii[i][j] = '8';
                }
                else
                    ascii[i][j] = ' ';
            }
        }

        for (char[] row : ascii){
            System.out.println(Arrays.toString(row));
        }

    }

    public static void initializeBoard(GamePieces[][] board){
        for (int i = 0; i < SIZE; i+=2) {
            board[18][i] = new Wall(18, i);
            board[0][i] = new Wall(0, i);
        }

        board[17][9] = new Pawn(17,9);
        board[1][9] = new Pawn(1, 9);
    }

    public static int getInputWallorPawn(Scanner s){
        String choice = s.nextLine();
        if(choice.equals("wall")){
            return 0;
        }
        if(choice.equals("pawn")) {
            return 1;
        }
        return -1;
    }
    public static int getX (Scanner s){
        return s.nextInt();
    }

    public static int getY (Scanner s){
        return s.nextInt();
    }

}
