import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] percentages = new int[n];
        for (int i = 0; i < n; i++) {
            percentages[i] = scanner.nextInt();
        }
        
        double sum = 0;
        for (int p : percentages) {
            sum += p;
        }
        
        double result = sum / n;
        System.out.printf("%.12f%n", result);
    }
}