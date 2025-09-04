import java.util.Scanner;
public class day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 1;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
                if (count >= 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                count = 1;
                prev = s.charAt(i);
            }
        }
        System.out.println("NO");
    }
}