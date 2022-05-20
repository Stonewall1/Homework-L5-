import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random()*100 + 1);
            }
        }
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[0].length; b++) {
                System.out.print(array[a][b] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println("Sorted array");
        for (int t = 0; t < array.length; t++) {
            for (int e = 0; e < array[0].length; e++) {
                System.out.print(array[t][e] + "\t");
            }
            System.out.println();
        }
    }
}
