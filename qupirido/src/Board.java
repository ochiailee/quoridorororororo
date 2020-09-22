import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Board {
    public static final int SIZE = 19;

    public static void main(String[] args) {
        int playerturn = 1;
        GamePieces[][] board = new GamePieces[SIZE][SIZE];
//        initializeBoard(board);
        Scanner s = new Scanner(System.in);

        Wall p1wall1 = new Wall(0,0);
        board[p1wall1.getX()][p1wall1.getY()] = p1wall1;

        Wall p1wall2 = new Wall(0,2);
        board[p1wall2.getX()][p1wall2.getY()] = p1wall2;

        Wall p1wall3 = new Wall(0,4);
        board[p1wall3.getX()][p1wall3.getY()] = p1wall3;

        Wall p1wall4 = new Wall(0,6);
        board[p1wall4.getX()][p1wall4.getY()] = p1wall4;

        Wall p1wall5 = new Wall(0,8);
        board[p1wall5.getX()][p1wall5.getY()] = p1wall5;

        Wall p1wall6 = new Wall(0,10);
        board[p1wall6.getX()][p1wall1.getY()] = p1wall6;

        Wall p1wall7 = new Wall(0,12);
        board[p1wall7.getX()][p1wall1.getY()] = p1wall7;

        Wall p1wall8 = new Wall(0,14);
        board[p1wall8.getX()][p1wall8.getY()] = p1wall8;

        Wall p1wall9 = new Wall(0,16);
        board[p1wall9.getX()][p1wall1.getY()] = p1wall9;

        Wall p1wall10 = new Wall(0,18);
        board[p1wall10.getX()][p1wall10.getY()] = p1wall10;

        Wall p2wall1 = new Wall(18,0);
        board[p2wall1.getX()][p2wall1.getY()] = p2wall1;

        Wall p2wall2 = new Wall(18,2);
        board[p2wall2.getX()][p2wall2.getY()] = p2wall2;

        Wall p2wall3 = new Wall(18,4);
        board[p2wall3.getX()][p2wall3.getY()] = p2wall3;

        Wall p2wall4 = new Wall(18,6);
        board[p2wall4.getX()][p2wall4.getY()] = p2wall4;

        Wall p2wall5 = new Wall(18,8);
        board[p2wall5.getX()][p2wall5.getY()] = p2wall5;

        Wall p2wall6 = new Wall(18,10);
        board[p2wall6.getX()][p2wall6.getY()] = p2wall6;

        Wall p2wall7 = new Wall(18,12);
        board[p2wall7.getX()][p2wall7.getY()] = p2wall7;

        Wall p2wall8 = new Wall(18,14);
        board[p2wall8.getX()][p2wall8.getY()] = p2wall8;

        Wall p2wall9 = new Wall(18,16);
        board[p2wall9.getX()][p2wall9.getY()] = p2wall9;

        Wall p2wall10 = new Wall(18,18);
        board[p2wall10.getX()][p2wall10.getY()] = p2wall10;

        Pawn p1pawn = new Pawn(17,9);
        Pawn p2pawn = new Pawn(1, 9);

        board[p1pawn.getX()][p1pawn.getY()] = p1pawn;
        board[p2pawn.getX()][p2pawn.getY()] = p2pawn;

        drawBoard(board);

        while(true){

            if(playerturn % 2 == 0){
                System.out.println("Player 2 turn");
                if(getInputWallorPawn(s) == 1){
                    System.out.println("you have selected pawn");

                    playerturn++;
                }
                else if(getInputWallorPawn(s) == 0){
                    System.out.println("you have selected wall");
                    System.out.println("Which wall would you like to move? ");
                    s.nextInt();

                    playerturn++;
                }
                else{
                    System.out.println("Please enter valid ");
                }
            }else{
                System.out.println("Player 1 turn");
                if(getInputWallorPawn(s) == 1){
                    System.out.println("you have selected pawn");

                    playerturn++;
                }
                else if(getInputWallorPawn(s) == 0){
                    System.out.println("you have selected wall");

                    playerturn++;
                }
                else{
                    System.out.println("Please enter valid ");
                }
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
}
