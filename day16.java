import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int x = 0, y = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        int rowMoves = Math.abs(x - 3);
        int colMoves = Math.abs(y - 3);
        System.out.println(rowMoves + colMoves);
    }
}