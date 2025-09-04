import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        
        int totalCost = k * w * (w + 1) / 2;
        int borrow = Math.max(0, totalCost - n);
        System.out.println(borrow);
    }
}