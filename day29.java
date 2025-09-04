public import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int countA = 0;
        int countD = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
            } else if (c == 'D') {
                countD++;
            }
        }
        
        if (countA > countD) {
            System.out.println("Anton");
        } else if (countD > countA) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
} {
    
}
