public import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Generate all lucky numbers up to 1000
        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        
        boolean isAlmostLucky = false;
        for (int num : luckyNumbers) {
            if (n % num == 0) {
                isAlmostLucky = true;
                break;
            }
        }
        
        System.out.println(isAlmostLucky ? "YES" : "NO");
    }
} {
    
}
