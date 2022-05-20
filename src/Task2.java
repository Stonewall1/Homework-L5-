import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] Chessboard = new String[8][8];
        for (int i = 0; i < Chessboard.length; i++) {
            for (int j = 0; j < Chessboard[0].length; j++) {
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)){
                    Chessboard[i][j] = "W";
                }
                else Chessboard[i][j] = "B";
            }
        }
        for (int k = 0; k < Chessboard.length; k++) {
            System.out.println(Arrays.toString(Chessboard[k]));
        }

        for (int g = 0; g < Chessboard.length; g++) {
            for (int l = 0; l < Chessboard.length ; l++) {
                System.out.print(Chessboard[g][l] + "\t");
            }
            System.out.println();
        }
    }
}
