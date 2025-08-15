import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        String reversedS = new StringBuilder(s).reverse().toString();
        System.out.println(t.equals(reversedS) ? "YES" : "NO");
    }
}