import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        int kthScore = scores[k - 1]; // k-th place score (1-indexed)
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (scores[i] > 0 && scores[i] >= kthScore) {
                count++;
            } else {
                break; // Since scores are non-increasing, stop if condition fails
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}