import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int upper = 0, lower = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else lower++;
        }

        System.out.println(upper > lower ? s.toUpperCase() : s.toLowerCase());
    }
}