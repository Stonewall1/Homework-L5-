import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add to every array element");
        int addition = scanner.nextInt();

        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] = (int)(Math.random()*100 + 1);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] = array[i][j][k] + addition;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
