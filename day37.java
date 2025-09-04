import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String program = scanner.nextLine();
        for (char c : program.toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}