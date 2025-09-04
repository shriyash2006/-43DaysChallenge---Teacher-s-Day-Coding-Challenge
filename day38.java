import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextInt();
        }
        
        int min = points[0];
        int max = points[0];
        int count = 0;
        
        for (int i = 1; i < n; i++) {
            if (points[i] > max) {
                max = points[i];
                count++;
            } else if (points[i] < min) {
                min = points[i];
                count++;
            }
        }
        System.out.println(count);
    }
}