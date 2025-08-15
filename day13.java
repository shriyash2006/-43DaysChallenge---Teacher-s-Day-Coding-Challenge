import java.util.Arrays;
import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    
        String[] summands = s.split("\\+");
        
        int[] numbers = new int[summands.length];
        for (int i = 0; i < summands.length; i++) {
            numbers[i] = Integer.parseInt(summands[i]);
        }
        Arrays.sort(numbers);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i < numbers.length - 1) {
                result.append("+");
            }
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}