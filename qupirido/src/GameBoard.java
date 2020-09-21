import java.util.Arrays;

public class GameBoard {
    GamePieces[][] gameboard = new GamePieces[19][19];

//    public GameBoard(GamePieces[][] gameboard){
//        this.gameboard = gameboard;
//    }
    public void populateGameBooard(){
        for (int i = 0; i < 19; i+= 2) {
            gameboard[0][i] = new GamePieces(0, i, false);
            gameboard[18][i] = new GamePieces(18, i, false);
        }

        gameboard[1][9] = new GamePieces(1, 9, true);
        gameboard[17][9] = new GamePieces(17,9, true);
    }
    public void drawGameBoard(){
        char wall = '*';
        char pawn = '0';

        char[][] drawable = new char[19][19];

        for (int i = 0; i < 19; i ++){
            for (int j = 0; j < 19; j++) {
                if(gameboard[i][j] != null && gameboard[i][j].pawn){
                    drawable[i][j] =  pawn;
                }
                else if(gameboard[i][j] != null && !gameboard[i][j].pawn){
                    drawable[i][j] = wall;
                }else
                    drawable[i][j] = ' ';
            }
        }

        for (char[] row : drawable){
            System.out.println(Arrays.toString(row));
        }
    }
}
