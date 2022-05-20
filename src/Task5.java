public class Task5 {
    public static void main(String[] args) {
        String[][] array = new String[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(i == j || i == array.length - (j + 1)){
                    array[i][j] = "X";
                }
                else array[i][j] = ".";
            }
        }
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[0].length; b++) {
                System.out.print(array[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
