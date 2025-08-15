import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        
        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        
        System.out.println(result);
        scanner.close();
    }
}