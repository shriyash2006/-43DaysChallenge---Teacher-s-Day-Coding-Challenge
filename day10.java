import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of problems
        int solvableProblems = 0;
        
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            // Count how many are sure (1)
            int sureCount = petya + vasya + tonya;
            if (sureCount >= 2) {
                solvableProblems++;
            }
        }
        
        System.out.println(solvableProblems);
        scanner.close();
    }
}