import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int dimension1 = 5;
        int dimension2 = 2;
        int[][] result = new int[dimension1][dimension2];

        int[][] first = { {1,2,3,0},
                          {1,1,1,0},
                          {0,2,2,0},
                          {6,2,0,7},
                          {0,76,0,3} };

        int[][] second = { {1,0},
                           {12,6},
                           {4,0},
                           {0,2} };

        for(int i = 0; i < first.length; i++){ // Going on lines
            for(int j = 0; j < second[0].length; j++){ // Going on pillars
                int sum = 0;
                for(int a = 0; a < second.length; a++){
                    sum = sum + (first[i][a] * second[a][j]);
                }
                result[i][j] = sum;
            }
        }

        System.out.println("Result of multiplication");
        for(int b = 0;b < result.length;b++){
            System.out.println(Arrays.toString(result[b]));
        }
    }
}
