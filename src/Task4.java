import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[10][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random()*100 + 1);
            }
        }
        for (int r = 0; r < array.length; r++) {
            System.out.println(Arrays.toString(array[r]));
        }
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[0].length; b++) {
                sum = sum + array[a][b];
            }
        }
        System.out.println("Sum of all array elements = " + sum);
    }
}
